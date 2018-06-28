package com.kadai.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByEmployeeName(String employee_name);
	public List<Employee> findByDepartmentIdAndPositionId(Integer departmentId, Integer positionId);
	public Employee findByDepartmentIdAndDivisionIdAndPositionId(Integer departmentId,Integer divisionId, Integer positionId);
}
