package com.info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBusinessAccounts")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int accountID;

	@Column(name="Holder_Name",nullable=false,length=90)
	private String accountHolderName;
	private String address;
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountID, String accountHolderName, String address, int balance) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.balance = balance;
	}
	public Account(String accountHolderName, String address, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.balance = balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountHolderName=" + accountHolderName + ", address=" + address
				+ ", balance=" + balance + "]";
	}
	
	
	
	
}//end class
