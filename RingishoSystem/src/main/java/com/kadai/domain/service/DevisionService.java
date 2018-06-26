package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Department;
import com.kadai.domain.repository.DepartmentRepository;

@Service
@Transactional
public class DevisionService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }
    
    public Department findOne(Integer departmentId){
        return departmentRepository.findById(departmentId).get();
    }
    
    public Department create(Department department){
        return departmentRepository.saveAndFlush(department);
    }
    
    public Department update(Department department){
        return departmentRepository.saveAndFlush(department);
    }
    
    public void delete(Integer departmentId){
    	departmentRepository.deleteById(departmentId);
    }
    
}
