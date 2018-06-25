package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Devision")
public class Devision {
	
	@Id
	@Column(name = "devision_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int devisionId;
	
	@Column(name = "devision_name")
	private String devisionName;
	
	public Devision() {
	}
	
	public Devision(String devisionName) {
		this();
		this.devisionName = devisionName;
	}
	
	public int getDevisionId() {
		return devisionId;
	}
	
	public void setDevisionId(int devisionId) {
		this.devisionId = devisionId;
	}
	
	public String getDevisionName() {
		return devisionName;
	}
	
	public void setDevisionName(String devisionName) {
		this.devisionName = devisionName;
	}
	
}