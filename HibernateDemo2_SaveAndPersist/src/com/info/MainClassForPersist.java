package com.info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainClassForPersist {

	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Account a = new Account("Suresh", "Noida",10000);
		int id = (int)session.save(a);
		System.out.println(a+" saved with id : "+id);
		
		t.commit();
		session.close();
		
	}// end main
}// end class
