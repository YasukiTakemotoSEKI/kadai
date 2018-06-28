package com.kadai.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.App;

public interface AppRepository extends JpaRepository<App, Integer> {
	public List<App> findByDepartmentIdAndDivisionIdAndAppStatus(int departmentId, int divisionId, String appStatus);
	public List<App> findByDepartmentIdAndAppStatus(int departmentId, String appStatus);
	public List<App> findByEmployeeId(int employeeId);
}
