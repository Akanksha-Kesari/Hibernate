package com.main;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class InsertObject {

	public static void main(String[] args) {
		Configuration cf=new Configuration().configure();
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Employee e=new Employee();
		e.setName("Amit");
		e.setSalary(54747.f);
		s.beginTransaction();
		s.save(e);
		s.getTransaction().commit();
		s.close();
		System.out.println("saved..");
		

	}

}
