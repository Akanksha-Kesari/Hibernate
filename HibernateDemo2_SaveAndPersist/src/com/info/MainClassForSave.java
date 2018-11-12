package com.info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainClassForSave {

	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Account a = new Account("Naresh", "Pune",16000);
		session.persist(a);
		System.out.println(a+" saved");
		
		session.evict(a);
		// session.clear(); // clear all the associated obj
		System.out.println(a+" : detached ....");
		
		try {
			System.out.println(" Trying to save account again...");
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		session.persist(a);
		System.out.println(a+" saved");
		
		t.commit();
		session.close();
		
	}// end main
}// end class
