package com.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_InfoTest")
public class Employee {
	@Id
	@Column(name="Emp_ID")
	int id;
	@Column(name="Emp_NAME",length=20,nullable=false)
	String name;
	@Column(name="Mobile_No",unique=true)
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
