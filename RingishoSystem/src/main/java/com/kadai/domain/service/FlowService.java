package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Flow;
import com.kadai.domain.repository.FlowRepository;

@Service
@Transactional
public class FlowService {
	
	@Autowired
	FlowRepository flowRepository;
	
    public List<Flow> findAll(){	
        return flowRepository.findAll();	
    }	
    	
    public Flow findOne(Integer flowId){	
        return flowRepository.findById(flowId).get();	
    }	
    	
    public Flow create(Flow flow){	
        return flowRepository.saveAndFlush(flow);	
    }	
    	
    public Flow update(Flow flow){	
        return flowRepository.saveAndFlush(flow);	
    }	
    	
    public void delete(Integer flow){	
    	flowRepository.deleteById(flow);
    }	
    
    public List<Flow> findByPriceId(int priceId){
    	return flowRepository.findByPriceId(priceId);
    }

}
