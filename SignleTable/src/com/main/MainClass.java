package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Person;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Person p=new Person("amit");
		Employee emp=new Employee("ramesh", "trainne", 30000);
		Student std=new Student("mahesh", "Btech", 30000);
		session.save(p);
		session.save(emp);
		session.save(std);
		t.commit();
		session.close();

	}

}
