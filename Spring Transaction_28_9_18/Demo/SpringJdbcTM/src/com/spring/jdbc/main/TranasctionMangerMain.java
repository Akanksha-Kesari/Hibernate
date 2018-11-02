package com.spring.jdbc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.service.CustomerManagerImpl;
import com.spring.jdbc.service.CustomerManger;
import com.spring.model.Address;
import com.spring.model.Customer;

public class TranasctionMangerMain {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		CustomerManger cust=ctx.getBean
		("customerManager", CustomerManagerImpl.class);
		cust.createCutomer(createNewCustomer());
			}

	private static Customer createNewCustomer()
	{
		
		Customer cust=new Customer();
		cust.setId(16);
		cust.setName("Ajay");
	   	
Address add=new Address();
add.setId(16);
add.setAddress("GGN");
add.setCountry("India");
cust.setAddress(add);
return cust;
	
	}
	
}
