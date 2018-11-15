package com.infogain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.dao.EmployeeDao;
import com.infogain.model.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
     
	@Autowired
	
	private EmployeeDao employeeDao;
	
	
	@Override
	public void addEmployee(Employee emp) {
	    employeeDao.addEmployee(emp);	
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployees();
	}

}
