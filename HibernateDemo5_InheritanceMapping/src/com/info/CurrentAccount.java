package com.info;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Account 
{
	private String companyName;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, int balance, ContactDetails contactDetails) {
		super(accountHolderName, balance, contactDetails);
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
