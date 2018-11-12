package com.main;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.entity.Employee;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("enter id");
		int id=sc.nextInt();
		Employee emp1=(Employee)session.load(Employee.class, new Integer(id));
		session.delete(emp1);
		tx.commit();
		session.close();
		
	}

}
