package com.info;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Document {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="pan_number",nullable=false)
	private int PAN_number;
	
	@OneToOne(mappedBy="docs",cascade=CascadeType.ALL)
	private Account account;
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(int id, int pAN_number) {
		super();
		this.id = id;
		PAN_number = pAN_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPAN_number() {
		return PAN_number;
	}
	public void setPAN_number(int pAN_number) {
		PAN_number = pAN_number;
	}
	
	
}//end class
