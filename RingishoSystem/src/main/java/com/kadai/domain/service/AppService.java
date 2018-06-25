package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.App;
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

    
}
