package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appflow")
public class Appflow {
	
	@Id
	@Column(name = "appflow_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appflowId;
	
	@Column(name = "app_id")
	private int appId;
	
	@Column(name = "flow_id")
	private int flowId;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "appflow_flg")
	private boolean appflowFlg;
	
	@Column(name = "appflow_order")
	private int appflowOrder;
	
	public Appflow() {
	}
	
	public Appflow(int appId, int flowId, int employeeId, boolean appflowFlg, int appflowOrder) {
		this();
		this.appId = appId;
		this.flowId = flowId;
		this.employeeId = employeeId;
		this.appflowFlg = appflowFlg;
		this.appflowOrder = appflowOrder;
		
	}
	
	public int getappFlowId() {	
		return appflowId;
	}	
		
	public void setappFlowId(int appflowId) {	
		this.appflowId = appflowId;
	}	
	
	public int getappId() {	
		return appId;
	}	
		
	public void setappId(int appId) {	
		this.appId = appId;
	}	

	public int getFlowId() {	
		return flowId;
	}	
		
	public void setFlowId(int flowId) {	
		this.flowId = flowId;
	}	
	
	public int getEmployeeId() {	
		return employeeId;
	}	
		
	public void setEmployeeId(int employeeId) {	
		this.employeeId = employeeId;
	}	
	
	public boolean getappflowFlg() {	
		return appflowFlg;
	}	
		
	public void setappflowFlg(boolean appflowFlg) {	
		this.appflowFlg = appflowFlg;
	}	

	public int getAppflowOrder() {	
		return appflowOrder;
	}	
		
	public void setAppflowOrder(int appflowOrder) {	
		this.appflowOrder = appflowOrder;
	}	


	
	
}