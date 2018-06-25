package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Position")
public class Position {
	
	@Id
	@Column(name = "position_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int positionId;
	
	@Column(name = "position_name")
	private String positionName;
	
	public Position() {
	}
	
	public Position(String positionName) {
		this();
		this.positionName = positionName;
	}
	
	public int getPositionId() {
		return positionId;
	}
	
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	
	public String getPositionName() {
		return positionName;
	}
	
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
}