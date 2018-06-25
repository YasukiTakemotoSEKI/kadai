package com.kadai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.App;

public interface AppRepository extends JpaRepository<App, Integer> {
}
