package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Price")
public class Price {
	
	@Id
	@Column(name = "price_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int priceId;
	
	@Column(name = "price_value")
	private int priceValue;
	
	public Price() {
	}
	
	public Price(int priceValue) {
		this();
		this.priceValue = priceValue;
	}
	
	public int getPriceId() {
		return priceId;
	}
	
	public void setPriceValue(int priceId) {
		this.priceId = priceId;
	}

	public int getPriceValue() {
		return priceValue;
	}
	
	public void setPriceId(int priceValue) {
		this.priceValue = priceValue;
	}
}