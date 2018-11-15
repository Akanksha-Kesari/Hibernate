package com.infogain.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			s.save(emp);
			tx.commit();
			s.close();
	}

	@Override
	public List<Employee> listEmployees() {
		
		
		return (List<Employee>) sessionFactory.openSession().createCriteria(Employee.class).list();
	}

}
