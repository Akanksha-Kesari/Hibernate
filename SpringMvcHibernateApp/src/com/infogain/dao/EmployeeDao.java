package com.infogain.dao;

import java.util.List;

import com.infogain.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee emp);
	public List<Employee> listEmployees();
	
}
