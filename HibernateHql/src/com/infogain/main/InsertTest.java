package com.infogain.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import com.infogain.model.Address;
import com.infogain.model.Employee;
public class InsertTest {
	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration()
		.configure().buildSessionFactory();
		Session s=sf.openSession();
		Employee e1=new Employee();
		e1.setName("Rohit");
		e1.setSalary(70000);
		Address a1=new Address();
		a1.setAddressLine1("Shastri Park");
		a1.setCity("DEL");
		a1.setZipcode("122002");
		e1.setAddress(a1);
		Employee e2=new Employee();
		e2.setName("Sachain");
		e2.setSalary(30000);
		Address a2=new Address();
		a2.setAddressLine1("Palam Vihar");
		a2.setCity("DEL");
		a2.setZipcode("122003");
		e2.setAddress(a2);
		
		Employee e3=new Employee();
		e3.setName("Saurabh");
		e3.setSalary(90000);
		Address a3=new Address();
		a3.setAddressLine1("Mayur Vihar");
		a3.setCity("DEL");
		a3.setZipcode("122003");
		e3.setAddress(a3);
		
		Transaction tx=s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		tx.commit();
		
		s.close();
		System.out.println("Done..");
			}

}
