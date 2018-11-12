package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Person;
import com.entity.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		Person p=new Person("Megha");
		Employee e=new Employee("Amit","trainee",30000);
		Student st=new Student("Ravic", "Btech", 300000);
		s.save(p);
		s.save(e);
		s.save(st);
		tx.commit();
		s.close();
		
		
		
		
	}

}
