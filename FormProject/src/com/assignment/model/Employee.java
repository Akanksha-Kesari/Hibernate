package com.assignment.model;



import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@Entity
//@XmlType(propOrder={"salary","designation,"})
public class Employee {

	@Id
	
	int employeeId;
	String name;
	String designation;
	float salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, String designation, float salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	

}
