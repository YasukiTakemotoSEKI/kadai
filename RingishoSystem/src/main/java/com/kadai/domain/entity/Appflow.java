package com.kadai.domain.entity;

import java.lang.reflect.Field;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appflow")
public class Appflow {

	@Id
	@Column(name = "appflow_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appflowId;

	@Column(name = "app_id")
	private int appId;

	@Column(name = "flow_id")
	private int flowId;

	@Column(name = "position_id")
	private int positionId;

	@Column(name = "appflow_flg")
	private boolean appflowFlg;

	@Column(name = "appflow_order")
	private int appflowOrder;
	
	//テーブル結合
	@ManyToOne
	@JoinColumn(name="flow_id", insertable=false, updatable=false)
	private Flow flow;
	
	@ManyToOne
	@JoinColumn(name="position_id", insertable=false, updatable=false)
	private Position position;
	
	public Appflow() {
	}

	public Appflow(int appId, int flowId, int positionId, boolean appflowFlg, int appflowOrder) {
		this();
		this.appId = appId;
		this.flowId = flowId;
		this.positionId = positionId;
		this.appflowFlg = appflowFlg;
		this.appflowOrder = appflowOrder;

	}

	public int getAppFlowId() {
		return appflowId;
	}

	public void setAppFlowId(int appflowId) {
		this.appflowId = appflowId;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int getFlowId() {
		return flowId;
	}

	public void setFlowId(int flowId) {
		this.flowId = flowId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public boolean getAppflowFlg() {
		return appflowFlg;
	}

	public void setAppflowFlg(boolean appflowFlg) {
		this.appflowFlg = appflowFlg;
	}

	public int getAppflowOrder() {
		return appflowOrder;
	}

	public void setAppflowOrder(int appflowOrder) {
		this.appflowOrder = appflowOrder;
	}
	
	public Flow getFlow() {
		return flow;
	}

	public void setFlow(Flow flow) {
		this.flow = flow;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Class: " + this.getClass().getCanonicalName() + "\n");
	    sb.append("Settings:\n");
	    for (Field field : this.getClass().getDeclaredFields()) {
	        try {
	            field.setAccessible(true);
	            sb.append(field.getName() + " = " + field.get(this) + "\n");
	        } catch (IllegalAccessException e) {
	            sb.append(field.getName() + " = " + "access denied\n");
	        }
	    }
	    return sb.toString();
	}
}