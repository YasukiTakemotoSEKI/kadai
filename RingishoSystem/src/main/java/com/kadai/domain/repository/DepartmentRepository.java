package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
