package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Flow;

public interface FlowRepository extends JpaRepository<Flow, Integer> {
}
