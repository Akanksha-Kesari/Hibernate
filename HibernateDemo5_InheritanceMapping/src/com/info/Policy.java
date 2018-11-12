package com.info;

import javax.persistence.Embeddable;

@Embeddable
public class Policy {

	private int amount;
	private String name;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
