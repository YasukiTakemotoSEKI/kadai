package com.kadai.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.App;

public interface AppRepository extends JpaRepository<App, Integer> {
	public List<App> findByDepartmentIdOrDivisionId(int departmentId, int divisionId);
	public List<App> findByDepartmentId(int departmentId);
}
