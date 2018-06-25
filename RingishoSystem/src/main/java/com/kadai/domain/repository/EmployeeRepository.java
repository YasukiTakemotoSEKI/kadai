package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByEmployeeName(String employee_name);
}
