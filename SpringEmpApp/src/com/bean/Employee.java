package com.bean;

public class Employee {
	int  eId;
	String name;
	String dept;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String name, String dept) {
		super();
		this.eId = eId;
		this.name = name;
		this.dept = dept;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", dept=" + dept + "]";
	}
	

}
