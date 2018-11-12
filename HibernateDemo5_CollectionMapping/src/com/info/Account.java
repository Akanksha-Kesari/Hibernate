package com.info;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Embedded
	private ContactDetails contactDetails;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNumber",column=@Column(name="HouseNumber_temp")),
		@AttributeOverride(name="cityName",column=@Column(name="cityName_temp")),
		@AttributeOverride(name="stateName",column=@Column(name="stateName_temp")),
		@AttributeOverride(name="phoneNumber",column=@Column(name="phoneNumber_temp")),
		@AttributeOverride(name="email",column=@Column(name="email_temp")),
	})
	private ContactDetails contactDetails_temporary;
	
	
	@CollectionOfElements
	private List<Policy> polies = new ArrayList<Policy>();	
	
	
	////////////////////////////////////////////
	
	
	public ContactDetails getContactDetails_temporary() {
		return contactDetails_temporary;
	}

	public List<Policy> getPolies() {
		return polies;
	}

	public void setPolies(List<Policy> polies) {
		this.polies = polies;
	}

	public void setContactDetails_temporary(ContactDetails contactDetails_temporary) {
		this.contactDetails_temporary = contactDetails_temporary;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolderName, int balance, ContactDetails contactDetails) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.contactDetails = contactDetails;
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

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
	
}//end class
