package com.spring.jdbc.service;

import org.springframework.transaction.annotation.Transactional;

import com.spring.jdbc.dao.CustomerDAO;
import com.spring.model.Customer;
public class CustomerManagerImpl implements CustomerManger{
private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
	return customerDAO;
}
public void setCustomerDAO(CustomerDAO customerDAO) {
	this.customerDAO = customerDAO;
}

@Override
@Transactional
public void createCutomer(Customer cust) {
customerDAO.create(cust);
		
	}

}
