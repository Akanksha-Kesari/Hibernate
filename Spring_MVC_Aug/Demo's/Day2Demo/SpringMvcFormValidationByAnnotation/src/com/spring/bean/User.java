package com.spring.bean;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
public class User {
@NotEmpty(message = "Please enter your name.")
@Size(min = 5, max = 15, message = "Your name must between 5 and 15 characters")
	 private String name;
	@Min(5)
    private int age;
	@Size(min=5, max=50)
    private String location;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Length(max=10,min=10,message="Phone number is not valid. "
			+ "Should be of length 10.")
	private String mob;
		public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	}
