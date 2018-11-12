package com.info;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name="MyBusinessAccounts")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int accountID;

	@Column(name="Holder_Name",nullable=false,length=90)
	private String accountHolderName;
	
	private int balance;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Doc_id")
	private Document docs;

	public Account(int accountID, String accountHolderName, int balance, Document docs) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.docs = docs;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolderName, int balance, Document docs) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.docs = docs;
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Document getDocs() {
		return docs;
	}

	public void setDocs(Document docs) {
		this.docs = docs;
	}
	
	
		
	
	
}//end class
