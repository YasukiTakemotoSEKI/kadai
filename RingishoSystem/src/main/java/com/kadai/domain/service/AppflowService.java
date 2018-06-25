package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Appflow;
import com.kadai.domain.repository.AppflowRepository;

@Service
@Transactional
public class AppflowService {
	
	@Autowired	
	AppflowRepository appflowRepository;	
		
	public Appflow save(Appflow appflow){	
        return appflowRepository.save(appflow);		
    }		
		
    public List<Appflow> findAll(){		
        return appflowRepository.findAll();		
    }		
    		
    public Appflow findOne(Integer appflowId){		
        return appflowRepository.findById(appflowId).get();		
    }		
    		
    public Appflow create(Appflow appflow){		
        return appflowRepository.save(appflow);		
    }		
    		
    public Appflow update(Appflow appflow){		
        return appflowRepository.save(appflow);		
    }		

    public void delete(Integer appflow){		
    	appflowRepository.deleteById(appflow);	
    }		


    
}
