package com.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.entity.Employee;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee emp=(Employee)session.get(Employee.class, new Integer(101));
		System.out.println(emp.getName());
		emp.setName("ouyt");
		System.out.println("name"+emp.getName());
		tx.commit();
		session.close();

	}

}
