package com.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.entity.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("abc");
		emp.setMobno("231234");
		Transaction tx=session.beginTransaction();
		session.save(emp);
		System.out.println("object persist");
		tx.commit();
		session.close();
		

	}

}
