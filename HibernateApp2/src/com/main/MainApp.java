package com.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.entity.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		/*Employee emp=new Employee();
		emp.setId(103);
		emp.setName("aMITi");
		emp.setMobno("1234325");
*/		Transaction tx=session.beginTransaction();
		//session.persist(emp);
		System.out.println("object persist");
		//Employee emp1=(Employee)session.get(Employee.class, new Integer(101));
		
		Employee emp1=(Employee)session.load(Employee.class, new Integer(101));
		System.out.println(emp1);
		tx.commit();
		session.close();
		

	}

}
