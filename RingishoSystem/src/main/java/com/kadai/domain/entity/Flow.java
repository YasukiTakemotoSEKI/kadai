package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flow")
public class Flow {
	
	@Id
	@Column(name = "flow_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flowId;
	
	@Column(name = "price_id")
	private int priceId;
	
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "flow_order")
	private int flowOrder;
	
	public Flow() {
	}
	
	public Flow(int priceId, int positionId, int flowOrder) {
		this();
		this.priceId = priceId;
		this.positionId = positionId;
		this.flowOrder = flowOrder;
	}
	
	public int getFlowId() {
		return flowId;
	}
	
	public void setFlowId(int flowId) {
		this.flowId = flowId;
	}
	
	public int getPriceId() {
		return priceId;
	}
	
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	
	public int getPositionId() {
		return positionId;
	}
	
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	
	public int getFlowOrder() {
		return flowOrder;
	}
	
	public void setFlowOrder(int flowOrder) {
		this.flowOrder = flowOrder;
	}
	
}