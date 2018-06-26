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
	
    public List<App> findAll(){	
        return appRepository.findAll();	
    }	
    	
    public App findOne(Integer appId){	
        return appRepository.findById(appId).get();	
    }	
    	
    public App create(App app){	
        return appRepository.saveAndFlush(app);	
    }	
    	
    public App update(App app){	
        return appRepository.saveAndFlush(app);
    }	
    	
    public void delete(Integer app){	
    	appRepository.deleteById(app);
    }
  

    /**
     * 申請金額のチェック
     * 戻り値
     * 処理が二回呼ばれる？不都合あれば修正
     */
    public void searchPrice(App app) {
		int appPrice = app.getAppPrice();
		// //Priceテーブルを昇順で取得
		List<Price> priceTableAll = new ArrayList<Price>(priceservice.findAll());
    	//申請金額（appPrice）が閾値（PriceValue）より低ければpriceId取得
    	int priceId = 0;
    	for (Price p:priceTableAll) {
    		if(appPrice <p.getPriceValue()) {
    			priceId = p.getPriceId();
    			break;
    		}
    	}
		app.setPriceId(priceId);
		create(app);
		
		//承認者データの取得
		Employee applicant = employeeservice.findOne(app.getEmployeeId());
		
		// priceIdごとに承認フロー(flow)レコード呼び出し・(appflow)のレコード作成。
		List<Flow> flowTableAll = new ArrayList<Flow>(flowservice.findByPriceId(priceId));
		for(Flow f:flowTableAll){
			//登録処理
			Appflow appflow = new Appflow();
			appflow.setappId(app.getAppId());
			appflow.setFlowId(f.getFlowId());
			appflow.setPositionId(f.getPositionId());
			appflow.setappflowFlg(true);
			appflow.setAppflowOrder(f.getFlowOrder());
			appflowservice.create(appflow);
		}
    }
}
