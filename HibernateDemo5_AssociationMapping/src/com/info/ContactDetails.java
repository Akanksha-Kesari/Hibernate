package com.info;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails {

	private String houseNumber;
	private String cityName;
	private String stateName;
	private long phoneNumber;
	private String email;
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(String houseNumber, String cityName, String stateName, long phoneNumber, String email) {
		super();
		this.houseNumber = houseNumber;
		this.cityName = cityName;
		this.stateName = stateName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
