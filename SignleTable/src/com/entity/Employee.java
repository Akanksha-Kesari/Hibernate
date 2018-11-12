package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("employee")
public class Employee extends Person{
	String desg;
	int salary;
	public Employee(String name, String desg, int salary) {
		super(name);
		this.desg = desg;
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [desg=" + desg + ", salary=" + salary + "]";
	}
	

}
