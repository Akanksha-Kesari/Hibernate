package com.info;

import java.util.ArrayList;
import java.util.List;

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
		
		
		Document doc1 = new Document();
		doc1.setPAN_number(12345);
		
		Account a = new Account("Mike",2000,doc1);
		
		session.save(a);
		System.out.println(" --- Account Saved ---");
		
		/*
		
	 a = (Account) session.get(Account.class, 10);
		System.out.println("Owner Name : "+a.getAccountHolderName());
		System.out.println(" Pan Number : "+a.getDocs().getPAN_number());
			
		// possible through Bi Direction only
		
		Document d = (Document)session.get(Document.class, 20);
		System.out.println(d.getAccount().getAccountHolderName());
		 */
		
		t.commit();
		session.close();
	}// end main
}// end class
