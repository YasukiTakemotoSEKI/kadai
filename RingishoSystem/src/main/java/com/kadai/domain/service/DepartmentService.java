package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Division;
import com.kadai.domain.repository.DevisionRepository;

@Service
@Transactional
public class DepartmentService {
	
	@Autowired
	DevisionRepository devisionRepository;
	
    public List<Division> findAll(){	
        return devisionRepository.findAll();	
    }	
    	
    public Division findOne(Integer devisionId){	
        return devisionRepository.findById(devisionId).get();	
    }	
    	
    public Division create(Division devision){	
        return devisionRepository.saveAndFlush(devision);
    }	
    	
    public Division update(Division devision){	
        return devisionRepository.saveAndFlush(devision);
    }	
    	
    public void delete(Integer devision){	
    	devisionRepository.deleteById(devision);
    }	

    
}
