package com.info;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import javafx.scene.shape.QuadCurve;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("from Account where id=:query_id");
		q.setInteger("query_id", 10);
		
		List<Account> accountResult = q.list();
		
		System.out.println(accountResult.size());
		
		q = session.createQuery("amountQuery");
		q.setInteger("amount", 1000);
		
		accountResult = q.list();
		
		System.out.println(accountResult.size());
		
		t.commit();
		session.close();
	}// end main
}// end class
