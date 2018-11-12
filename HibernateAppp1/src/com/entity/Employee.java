package com.entity;

public class Employee {
	int id;
	String name;
	String mobno;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String mobno) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobno=" + mobno + "]";
	}
	

}
