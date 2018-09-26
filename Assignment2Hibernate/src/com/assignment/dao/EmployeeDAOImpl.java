package com.assignment.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.assignment.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	public String add(Employee emp)
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		session.save(emp);
		t.commit();
		return "added";	
	}
	
	public List<Employee> getall()
	{
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("from Employee");
		List<Employee> emp=query.list();
		return emp;
		
	}
	
	public List<Employee> getAllSalary(float a,float b)
	{
		
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("from Employee where salary between ? and ?");
		query.setFloat(0, a);
		query.setFloat(1, b);
		List<Employee> emp=query.list();
		return emp;
		
	}
	
	public List<Employee>  getById(int id)
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("from Employee where id=?");
		query.setInteger(0, id);
		
		List<Employee> emp=query.list();
		return emp;
		
		
	}
	
	public String updateAll(Employee emp)
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("update Employee set name=?,designation=?,salary=? where employeeId=?");
		
		query.setString(0, emp.getName());
		query.setString(1, emp.getDesignation());
		query.setFloat(2, emp.getSalary());
		query.setInteger(3, emp.getEmployeeId());
		int result=query.executeUpdate();
		t.commit();
		if(result>0)
		return "update all";
		else return "not updated";
		
	}

	public String updateName(Employee emp)
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("update Employee set name=? where employeeId=?");
		query.setString(0, emp.getName());
		query.setInteger(1, emp.getEmployeeId());
		
		int result=query.executeUpdate();
		t.commit();
		if(result>0)
		return "name update";
		else return "not updated";
	}
	
	public String deleteAll()
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("delete from Employee ");
		int r=query.executeUpdate();
		t.commit();
		if(r>0)
		return "delete all";
		else
			return "not delete";
		
	}
	
	public String deleteById(int id)
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("delete  from Employee where employeeId=?");
		query.setInteger(0, id);
		int r=query.executeUpdate();
		t.commit();
		if(r>0)
		return "delete one";
		else
			return "not delete";
		
		
	}
	
	/*public List<Employee> reverse()
	{
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		Query query=session.createQuery("select salary from Employee ");
		List<Employee> emp=query.list();
		return emp;
		
	}*/
}
