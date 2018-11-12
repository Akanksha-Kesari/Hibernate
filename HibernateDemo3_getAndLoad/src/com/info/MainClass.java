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

		/*
		 * Account a = (Account)session.get(Account.class,10); try {
		 * Thread.sleep(1000); } catch (Exception e) { // TODO: handle exception
		 * System.out.println(e); }
		 * System.out.println("Account holder name  : "+a.getAccountHolderName()
		 * );
		 */

		Account a = (Account) session.load(Account.class, 100); // proxy object
		System.out.println("load called ...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Account holder name  : " + a.getAccountHolderName());

		System.out.println(" ----- Session Close -----");

	}// end main
}// end class
