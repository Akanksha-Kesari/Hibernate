package com.infogain.bean;

public class Contact {

	private String firstname;
	private String lastname;
	private String email;
	private String telephone;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String firstname, String lastname, String email, String telephone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", telephone="
				+ telephone + "]";
	}
		
	
}
