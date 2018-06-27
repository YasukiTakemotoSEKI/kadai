package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Division;

public interface DevisionRepository extends JpaRepository<Division, Integer> {
}
