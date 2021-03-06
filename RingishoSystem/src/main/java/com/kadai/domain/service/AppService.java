package com.kadai.domain.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Appflow;
import com.kadai.domain.entity.Employee;
import com.kadai.domain.entity.Flow;
import com.kadai.domain.entity.Price;
import com.kadai.domain.repository.AppRepository;

@Service
@Transactional
public class AppService {

	@Autowired
	AppRepository appRepository;

	@Autowired
	PriceService priceservice;

	@Autowired
	FlowService flowservice;

	@Autowired
	AppflowService appflowservice;

	@Autowired
	EmployeeService employeeservice;

	public List<App> findAll() {
		return appRepository.findAll();
	}

	public App findOne(Integer appId) {
		return appRepository.findById(appId).get();
	}

	public App create(App app) {
		return appRepository.saveAndFlush(app);
	}

	public App update(App app) {
		return appRepository.saveAndFlush(app);
	}

	public void delete(Integer app) {
		appRepository.deleteById(app);
	}

	public List<App> findByDepartmentIdAndDivisionIdAndAppStatus(Integer departmentId, Integer divisionId,
			String appStatus) {
		return appRepository.findByDepartmentIdAndDivisionIdAndAppStatus(departmentId, divisionId, appStatus);
	}

	public List<App> findByEmployeeId(int employeeId) {
		return appRepository.findByEmployeeId(employeeId);
	}
	
	public List<App> findByDepartmentIdAndAppStatus(Integer departmentId, String appStatus) {
		return appRepository.findByDepartmentIdAndAppStatus(departmentId, appStatus);
	}

	public List<App> ApprovalStatus(Employee employee) {
		List<App> app = new ArrayList<App>(findByEmployeeId(employee.getEmployeeId()));
		return app;
	}

	/**
	 * 承認済みかどうかを返す。
	 * 
	 * @param app
	 * @return boolean true：承認済み false:未承認
	 */
	public void checkApproval(App app) {
		int positionId = 0;
		int departmentId = 0;
		int divisionId = 0;
		List<Employee> employee = new ArrayList<Employee>();
		Employee employee2 = new Employee();
		if (app.getAppStatus().equals("却下")) {
			for (Appflow af : app.getAppflow()) {
				if (af.getAppflowFlg() == true) {
					positionId = af.getPositionId();
					departmentId = app.getDepartmentId();
					divisionId = app.getDivisionId();
					break;
				}
			}
			employee = employeeservice.findByDepartmentIdAndPositionId(departmentId, positionId);
			if (employee.size() > 1) {
				employee2 = employeeservice.findByDepartmentIdAndDivisionIdAndPositionId(departmentId, divisionId,
						positionId);
			} else {
				employee2 = employee.get(0);
			}
			app.setAppApprovalName(employee2.getEmployeeName());
		}
	}

	public List<App> IncompleteList(Employee employee) {
		// employeeのposition確保
		// appからdivisionとdepartmentでappを絞る。すでに承認取り下げの案件は排除。
		// devisionが0なら部長。
		List<App> app = new ArrayList<App>();
		if (employee.getDivisionId() == 0) {
			app = findByDepartmentIdAndAppStatus(employee.getDepartmentId(), "進行中");
		} else {
			app = findByDepartmentIdAndDivisionIdAndAppStatus(employee.getDepartmentId(), employee.getDivisionId(),
					"進行中");
		}
		Iterator<App> test = app.iterator();
		boolean checkFlg = true;
		while (test.hasNext()) {
			App a = test.next();
			// appflowで絞ったリストの作成。
			for (Appflow af : a.getAppflow()) {
				// 自分の役職より低い承認者の承認がされていなければ無効
				if ((employee.getPositionId() > af.getPositionId()) && (af.getAppflowFlg() == true)) {
					checkFlg = false;
				}
				// 自分の役職と同じで、すでに承認されていれば無効（承認済み）
				if ((employee.getPositionId() == af.getPositionId()) && (af.getAppflowFlg() == false)) {
					checkFlg = false;
				}
				// 社員の場合は承認権限無し。
				if (employee.getPositionId() == 1) {
					checkFlg = false;
				}
			}
			if (checkFlg == false) {
				test.remove();
				checkFlg = true;
			}
		}
		return app;
	}

	/**
	 * 申請金額のチェック 戻り値 処理が二回呼ばれる？不都合あれば修正
	 */
	public void searchPrice(App app) {
		int appPrice = app.getAppPrice();
		// //Priceテーブルを昇順で取得
		List<Price> priceTableAll = new ArrayList<Price>(priceservice.findAll());
		// 申請金額（appPrice）が閾値（PriceValue）より低ければpriceId取得
		int priceId = 0;
		for (Price p : priceTableAll) {
			if (appPrice <= p.getPriceValue()) {
				priceId = p.getPriceId();
				break;
			}
		}
		app.setPriceId(priceId);
		create(app);

		// priceIdごとに承認フロー(flow)レコード呼び出し・(appflow)のレコード作成。
		List<Flow> flowTableAll = new ArrayList<Flow>(flowservice.findByPriceId(priceId));
		for (Flow f : flowTableAll) {
			// 登録処理
			Appflow appflow = new Appflow();
			appflow.setAppId(app.getAppId());
			appflow.setFlowId(f.getFlowId());
			appflow.setPositionId(f.getPositionId());
			appflow.setAppflowFlg(true);
			appflow.setAppflowOrder(f.getFlowOrder());
			appflowservice.create(appflow);
		}
	}

	public void approval(int appId, int positionId) {
		// 該当のレコードを取得
		App app = findOne(appId);
		// Appflowテーブルを更新
		boolean allApprobalFlg = false;
		for (Appflow af : app.getAppflow()) {
			// 該当の行を更新する
			if (positionId == af.getPositionId()) {
				af.setAppflowFlg(false);
				appflowservice.update(af);
			}
			if (af.getAppflowFlg() == false) {
				allApprobalFlg = true;
			} else {
				allApprobalFlg = false;
			}
		}
		// すべての承認を完了していればAppテーブルを更新
		if (allApprobalFlg) {
			app.setAppStatus("承認済");
			update(app);
		} else {
			app.setAppStatus("進行中");
			update(app);
		}
	}

	public void dismissal(int appId, int positionId) {
		// Appテーブルを更新（AppFlowは変更しない）
		App app = findOne(appId);
		app.setAppStatus("却下");
		update(app);
	}

}
