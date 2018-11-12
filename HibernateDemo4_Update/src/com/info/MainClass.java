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

		Transaction t = session.beginTransaction();
		
		/*Account a = (Account)session.get(Account.class,10);
		a.setAddress("Noida-123");
		*/
		
		
		Account acc = new Account("Suresh", "New Delhi",5000);
		acc.setAccountID(10);
		session.update(acc);
		
		System.out.println(" Updation done ....");
		
		t.commit();
		session.close();
	}// end main
}// end class
