package com.kadai.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.App;

public interface AppRepository extends JpaRepository<App, Integer> {
	public List<App> findByDepartmentIdAndDivisionIdAndAppFlg(int departmentId, int divisionId, boolean appFlg);
	public List<App> findByDepartmentIdAndAppFlg(int departmentId, boolean appFlg);
	public List<App> findByEmployeeId(int employeeId);
}
