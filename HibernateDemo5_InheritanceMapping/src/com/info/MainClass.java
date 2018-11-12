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
		
		ContactDetails cd = new ContactDetails("XYZ-544353","New Delhi","Delhi",909090,"mike@abc.com");
		ContactDetails cd_temp = new ContactDetails("XYZ-544353","UP","Noida",909090,"mike@xyz.com");
		
		Policy p1 = new Policy(4000,"Policy-1");
		Policy p2 = new Policy(7000,"Policy-2");
		
		List<Policy> policyList = new ArrayList<>();
		policyList.add(p1);
		policyList.add(p2);
		
		
		Account a = new Account("Mike",2000, cd);
		a.setContactDetails_temporary(cd_temp);
		a.setPolies(policyList);
		
		session.save(a);
		System.out.println(" Account saved ....");
		
		///////////////////////////////////////////////////////////////
		
		///  Information of Current Account (Sub Type)

		ContactDetails cd2 = new ContactDetails("XYZ-544353","Mumbai","Maha",909090,"mike@abc.com");
		ContactDetails cd_temp2 = new ContactDetails("XYZ-544353","Pune","Maha",909090,"mike@xyz.com");
		
		Policy p1_2 = new Policy(4000,"Policy-3");
		Policy p2_2 = new Policy(7000,"Policy-4");
		
		List<Policy> policyList_2 = new ArrayList<>();
		policyList_2.add(p1_2);
		policyList_2.add(p2_2);
		
		CurrentAccount ca = new CurrentAccount("Mike",20000, cd2);
		ca.setContactDetails_temporary(cd_temp2);
		ca.setPolies(policyList_2);
		ca.setCompanyName("Infogain");
		
		session.save(ca);
		
		System.out.println(" CurrentAccount saved ....");
		
		
		
		t.commit();
		session.close();
	}// end main
}// end class
