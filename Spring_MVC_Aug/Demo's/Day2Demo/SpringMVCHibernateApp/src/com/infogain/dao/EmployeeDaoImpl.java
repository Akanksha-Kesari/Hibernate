package com.infogain.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Employee;
/*
 * @Repository – annotate classes at persistence layer, which will act as database repository.
 */
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	//gets injected by the Spring container during bean initialization
	@Autowired
	private SessionFactory sessionFactory;
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
			}
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployeess() {
return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
					}

}
