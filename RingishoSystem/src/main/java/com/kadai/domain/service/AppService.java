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
     * 戻り値 int priceId
     * 処理が二回呼ばれる？不都合あれば修正
     */
    public Integer searchPrice(Integer appPrice,List<Price> tableAll) {
    	//申請金額（appPrice）が閾値（PriceValue）より低ければpriceId取得
    	int priceId = 0;
    	for (Price p:tableAll) {
    		if(appPrice <p.getPriceValue()) {
    			priceId = p.getPriceId();
    			
    			break;
    		}
    	}
    	return priceId;
    }
}

