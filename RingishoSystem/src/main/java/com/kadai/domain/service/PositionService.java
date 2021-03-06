package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Position;
import com.kadai.domain.repository.PositionRepository;

@Service
@Transactional
public class PositionService {
	
	@Autowired
	PositionRepository positionRepository;
	
	
    public List<Position> findAll(){	
        return positionRepository.findAll();	
    }	
    	
    public Position findOne(Integer positionId){	
        return positionRepository.findById(positionId).get();	
    }	
    	
    public Position create(Position position){	
        return positionRepository.saveAndFlush(position);
    }	
    	
    public Position update(Position position){	
        return positionRepository.saveAndFlush(position);
    }	
    	
    public void delete(Integer position){	
    	positionRepository.deleteById(position);
    }	

    
}
