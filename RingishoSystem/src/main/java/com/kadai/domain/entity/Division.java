package com.kadai.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Division")
public class Division {
	
	@Id
	@Column(name = "division_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int divisionId;
	
	@Column(name = "division_name")
	private String divisionName;
	
	//リレーション
	@OneToMany(mappedBy = "departmentId")
    private List<App> app;
	
	public Division() {
	}
	
	public Division(String divisionName) {
		this();
		this.divisionName = divisionName;
	}
	
	public int getdivisionId() {
		return divisionId;
	}
	
	public void setdivisionId(int divisionId) {
		this.divisionId = divisionId;
	}
	
	public String getdivisionName() {
		return divisionName;
	}
	
	public void setdivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	public List<App> getApp() {
		return app;
	}

	public void setApp(List<App> app) {
		this.app = app;
	}
	
}