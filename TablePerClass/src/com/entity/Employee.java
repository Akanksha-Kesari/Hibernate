package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Data")

public class Employee extends Person {
	String desc;
	int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee( String name, String desc, int salary) {
		super(name);
		this.desc = desc;
		this.salary = salary;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [desc=" + desc + ", salary=" + salary + "]";
	}
	
	

}
