package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {
}
