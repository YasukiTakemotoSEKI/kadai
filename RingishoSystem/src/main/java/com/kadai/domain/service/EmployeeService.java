package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Employee;
import com.kadai.domain.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
	
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    
    public Employee findOne(Integer employeeId){
        return employeeRepository.findById(employeeId).get();
    }
    
    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }
    
    public Employee update(Employee employee){
        return employeeRepository.save(employee);
    }
    
    public void delete(Integer employeeId){
    	employeeRepository.deleteById(employeeId);
    }
    
}
