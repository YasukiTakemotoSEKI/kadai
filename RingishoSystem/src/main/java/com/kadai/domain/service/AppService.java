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
	
	public List<App> findByDepartmentIdAndDivisionIdAndAppFlg(Integer departmentId,Integer divisionId, boolean appFlg){
		return appRepository.findByDepartmentIdAndDivisionIdAndAppFlg(departmentId, divisionId, appFlg);
	}
	
	public List<App> findByEmployeeId(int employeeId){
		return appRepository.findByEmployeeId(employeeId);
	}
	
//	public List<App> findByAppId(App app) {
//		return app;
//		
//	}
	public List<App> findByDepartmentIdAndAppFlg(Integer departmentId, boolean appFlg) {
		return appRepository.findByDepartmentIdAndAppFlg(departmentId, appFlg);
		
	}

	public List<App> ApprovalStatus(Employee employee){
		List<App> app = new ArrayList<App>(findByEmployeeId(employee.getEmployeeId()));
//		System.out.println(app);
		return app;
		
	}
	/**
	 * 承認済みかどうかを返す。
	 * @param app
	 * @return boolean true：承認済み　false:未承認
	 */
	public boolean checkApproval(App app) {
		boolean checkFlg=false;
		if (appflowservice.findByAppIdAndAppflowFlg(app.getAppId(), true).isEmpty()==true){
			checkFlg=true;
		}
//		System.out.println(appflowservice.findByAppIdAndAppflowFlg(app.getAppId(), true));
		return checkFlg;
	}
	
	public List<App> IncompleteList(Employee employee) {
		// employeeのposition確保
		int positionId = employee.getPositionId();
		// appからdivisionとdepartmentでappを絞る。すでに承認取り下げの案件は排除。
		// devisionが0なら部長。
		List<App> app = new ArrayList<App>();
		if(employee.getDivisionId() == 0){
			app = findByDepartmentIdAndAppFlg(employee.getDepartmentId(), true);
		}else {
			app = findByDepartmentIdAndDivisionIdAndAppFlg(employee.getDepartmentId(),employee.getDivisionId(), true);
		}
		
		Iterator<App> test = app.iterator();
		
		boolean checkFlg = true;
		while(test.hasNext()) {
			App a = test.next();
			
			for(Appflow af : a.getAppflow()) {
				
				//appflowで絞ったリストの作成。
				
				//自分の役職より低い承認者の承認がされていなければ無効
				if( ( employee.getPositionId() > af.getPositionId() ) && ( af.getAppflowFlg() == true ) ) {
					checkFlg = false;
				}
				//自分の役職と同じで、すでに承認されていれば無効（承認済み）
				if( ( employee.getPositionId() == af.getPositionId() ) && ( af.getAppflowFlg() == false ) ) {
					checkFlg = false;
				}
				//社員の場合は承認権限無し。
				if (employee.getPositionId()==1) {
					checkFlg = false;
				}

			}
			
			if( checkFlg == false  ) {
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
		//該当のレコードを取得
		App app = findOne(appId);
		//Appflowテーブルを更新
		boolean allApprobalFlg = false;
		for(Appflow af : app.getAppflow()) {
			//該当の行を更新する
			if( positionId == af.getPositionId() ) {
				af.setAppflowFlg(false);
				appflowservice.update(af);
			}
			if(af.getAppflowFlg() == false) {
				allApprobalFlg = true;
			} else {
				allApprobalFlg = false;
			}
		}
		//すべての承認を完了していればAppテーブルを更新
		if(allApprobalFlg) {
			app.setAppFlg(false);
			update(app);
		}
	}
	
	public void dismissal(int appId, int positionId) {
		//Appテーブルを更新（AppFlowは変更しない）
		App app = findOne(appId);
		app.setAppFlg(false);
		update(app);
	}
}
