package com.info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Account obj is in transient state
		Account account = new Account("Ramesh","Mumbai",22000);
		
		Transaction t = session.beginTransaction();
		
		session.save(account);
		// Account Object is in persistent state 
		
		t.commit();
		session.evict(account);
		// account object is in detatched state.
		
		session.clear(); // session is still alive but clears the associated persisted obj.
		session.close();

		
		System.out.println(" ----- Session Close -----");
		
		
	}//end main
}//end class
