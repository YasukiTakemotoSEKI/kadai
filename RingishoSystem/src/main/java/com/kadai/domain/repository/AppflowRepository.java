package com.kadai.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadai.domain.entity.Appflow;

public interface AppflowRepository extends JpaRepository<Appflow, Integer> {
	public List<Appflow> findByAppIdAndPositionIdAndAppflowFlg(int appId,int positionId,boolean appflowFlg);
	public List<Appflow> findByAppIdAndAppflowFlg(int appId,boolean appflowFlg);
}
