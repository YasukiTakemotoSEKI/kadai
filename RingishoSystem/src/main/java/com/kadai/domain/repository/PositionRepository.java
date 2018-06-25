package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
