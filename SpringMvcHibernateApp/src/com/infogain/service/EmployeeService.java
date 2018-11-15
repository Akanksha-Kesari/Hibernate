package com.infogain.service;

import java.util.List;

import com.infogain.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	public List<Employee> listEmployees();
	
}
