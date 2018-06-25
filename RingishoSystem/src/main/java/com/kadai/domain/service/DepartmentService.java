package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Devision;
import com.kadai.domain.repository.DevisionRepository;

@Service
@Transactional
public class DepartmentService {
	
	@Autowired
	DevisionRepository devisionRepository;
	
	public Devision save(Devision devision){
        return devisionRepository.save(devision);	
    }	
	
    public List<Devision> findAll(){	
        return devisionRepository.findAll();	
    }	
    	
    public Devision findOne(Integer devisionId){	
        return devisionRepository.findById(devisionId).get();	
    }	
    	
    public Devision create(Devision devision){	
        return devisionRepository.save(devision);	
    }	
    	
    public Devision update(Devision devision){	
        return devisionRepository.save(devision);	
    }	
    	
    public void delete(Integer devision){	
    	devisionRepository.deleteById(devision);
    }	

    
}
