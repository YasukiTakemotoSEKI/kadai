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
import com.kadai.domain.entity.Price;
import com.kadai.domain.repository.AppRepository;

@Service
@Transactional
public class AppService {
	
	@Autowired
	AppRepository appRepository;
	
	public App save(App app){
        return appRepository.save(app);	
    }	
	
    public List<App> findAll(){	
        return appRepository.findAll();	
    }	
    	
    public App findOne(Integer appId){	
        return appRepository.findById(appId).get();	
    }	
    	
    public App create(App app){	
        return appRepository.save(app);	
    }	
    	
    public App update(App app){	
        return appRepository.save(app);	
    }	
    	
    public void delete(Integer app){	
    	appRepository.deleteById(app);
    }	

    /**
     * 申請金額のチェック
     * 戻り値 int priceId
     * 
     */
    public void checkPrice() {

//    	App app = new App(1,1,1,1,false,"稟議システムの決済について","稟議書システムの決済をお願いいたします。",5000,"http://tenpusiryooo","とにかくお願いします。",null,null);
//    	App app = new App();
//    	AppService appService = new AppService();
//    	app.setAppAttachment("http://tenpusiryooo");
//    	app.setAppComment("とにかくお願いします。");
//    	app.setAppContent("稟議書システムの決済をお願いいたします。");
//    	app.setAppFlg(false);
//    	app.setAppPrice(5000);
//    	app.setAppStartDate(null);
//    	app.setAppEndDate(null);
//    	app.setAppSubject("稟議システムの決済について");
//    	app.setDepartmentId(1);
//    	app.setDivisionId(1);
//    	app.setEmployeeId(1);
//    	app.setPriceId(1);


//    	int appPrice = app.getAppPrice();
//    	
//    	app.setPriceId(app.getPriceId());
//    	PriceService priceService = new PriceService();
//    	//Priceテーブルを昇順で取得
//    	ArrayList<Price> tableAll = new ArrayList<Price>(priceService.findAll());
//    	Collections.sort(tableAll,new PriceValueComparator());
//    	//申請金額（appPrice）が閾値（PriceValue）より低ければpriceId取得
//    	for (Price p:tableAll) {
//    		if(appPrice <p.getPriceValue()) {
//    			int priceId = p.getPriceId();
//    			break;
//    		}
//    	}
    	
    	
    }

    
    
}
class PriceValueComparator implements Comparator<Price>{
	@Override
	public int compare(Price p1,Price p2) {
		return p1.getPriceValue() < p2.getPriceValue() ? -1 : 1;
	}
}

