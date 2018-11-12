package com.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.infogain.model.Address;
import com.infogain.model.Employee;
import com.infogain.persistence.*;
public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address = new Address("HN-32", "Noida", "UP", "600097");
			Employee emp = new Employee("Ravic", address);
			session.save(emp);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
