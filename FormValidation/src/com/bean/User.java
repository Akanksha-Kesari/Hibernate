package com.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="Please enter name")
	@Size(min=5,max=15,message="name must be between 5 and 15 characters")
	private String name;
	
	@Min(5)
	private int age;
	
	@Size(min=5,max=50)
	private String location;
	
	@NotEmpty(message="enter email")
	@Email(message="Not a valid Email")
	private String email;
	
	@NotEmpty
	@Length(max=10,min=10,message="Phone number should be of 10")
	private String mob;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String location, String email, String mob) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.email = email;
		this.mob = mob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", location=" + location + ", email=" + email + ", mob=" + mob
				+ "]";
	}
	

}
