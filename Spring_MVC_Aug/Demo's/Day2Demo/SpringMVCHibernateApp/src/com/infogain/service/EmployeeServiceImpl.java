package com.infogain.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infogain.dao.EmployeeDao;
import com.infogain.model.Employee;
/*
 * @Service – annotate classes at service layer level.
 * @Service which means that this will be a bean managed by Spring Container
 * @Transactional so the Spring Hibernate transaction manager creates the required 
 * transactions and the respective sessions.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
	
	@Transactional
	public List<Employee> listEmployeess() {
		return employeeDao.listEmployeess();
	}
}
