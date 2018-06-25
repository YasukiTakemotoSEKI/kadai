package com.kadai.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.Employee;
import com.kadai.domain.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService implements UserDetailsService {
	
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

	@Override
	public UserDetails loadUserByUsername(String employee_name) throws UsernameNotFoundException {
		if(employee_name == null || "".equals(employee_name)) {
			throw new UsernameNotFoundException("Username is Empty");
		}
	    Employee employee = employeeRepository.findByEmployeeName(employee_name);
	    if (employee == null) {
	      throw new UsernameNotFoundException("Employee not found for name: " + employee_name);
	    }
		return employee;
	}
    
}
