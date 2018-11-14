package com.infogain.service;

import java.util.List;

import com.infogain.model.Employee;


public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
		
}
