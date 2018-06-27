package com.kadai.domain.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
	
	public List<App> findByDepartmentIdOrDivisionIdAndAppFlg(Integer departmentId,Integer divisionId, boolean appFlg){
		return appRepository.findByDepartmentIdOrDivisionIdAndAppFlg(departmentId, divisionId, appFlg);
	}
	
//	public List<App> findByAppId(App app) {
//		return app;
//		
//	}
	public List<App> findByDepartmentIdAndAppFlg(Integer departmentId, boolean appFlg) {
		return appRepository.findByDepartmentIdAndAppFlg(departmentId, appFlg);
		
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
			app = findByDepartmentIdOrDivisionIdAndAppFlg(employee.getDepartmentId(),employee.getDivisionId(), true);
		}
		List<Appflow> appflow = new ArrayList<Appflow>();
		for(App a:app) {
			System.out.println(app);
			
			//不要な要素は削除（remove）
//			app.remove(employee);
			System.out.println(app);
			for(Appflow f : a.getAppflow()) {
				//appflowで絞ったリストの作成。
				if(f.getAppflowFlg()==true) {
					if(f.getAppId()==a.getAppId()) {
						if(f.getPositionId()==employee.getPositionId()) {
						}
					}
				}
//				a.getAppflow().remove(f.getAppFlowId());
//				appflowservice.findByAppIdAndPositionIdAndAppflowFlg(a.getAppId(), employee.getPositionId(), true);
			}
			System.out.println(a.getAppflow());
		}
		
		
		// positionでappflowのリストをさらに絞る。
		//　非承認の案件のみ
		for(App a:app) {
			appflow = new ArrayList<Appflow>(appflowservice.findByAppIdAndPositionIdAndAppflowFlg(a.getAppId(), employee.getPositionId(), true));
		}
//		appflowservice.findByAppIdAndPositionIdAndAppflowFlg(app.getAppId(), employee.getPositionId(), true);
		for(Appflow af : appflow) {
			System.out.println("appi"+af.getAppId());
			System.out.println("posi"+af.getPositionId());
			System.out.println("flow"+af.getAppflowOrder());
		}
		
		// positionで絞れたら未承認案件を表示。
		
		return null;
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
			if (appPrice < p.getPriceValue()) {
				priceId = p.getPriceId();
				break;
			}
		}
		app.setPriceId(priceId);
		create(app);

		// 承認者データの取得
		Employee applicant = employeeservice.findOne(app.getEmployeeId());

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
}
