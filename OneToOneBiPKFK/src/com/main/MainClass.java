package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.entity.Country;
import com.entity.HeadOfState;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		/*HeadOfState hos=new HeadOfState("Pm","mODI");
		Country c=new Country("India", hos);
		session.save(c);
		*/HeadOfState hos1=(HeadOfState)session.load(HeadOfState.class, 22);
		System.out.println(hos1.getCont().getId());
		
		t.commit();
		session.close();
	}

}
