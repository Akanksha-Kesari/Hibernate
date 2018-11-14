package com.spring.bean;

public class Employee {
	private int empId;
	private String name;
	private float salary;
	private int age;
	
	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String toString(){
		return "Employee{ name-"+name+" age-"+age+" salary-"+salary+"}";
	}
}
