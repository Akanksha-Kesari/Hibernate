package com.spring.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.model.Customer;
public class CustomerDaoImpl implements CustomerDAO{
	private DataSource dataSource;
		public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void create(Customer customer) {
	String queryCustomer=
	"insert into customer1 (id,name) values(?,?)";
	String queryAddress=
"insert into address1 (id,address,country) values(?,?,?)";
JdbcTemplate temp=new JdbcTemplate(dataSource);
temp.update(queryCustomer,new Object[]
{customer.getId(),customer.getName()});
System.out.println("Customer Object Inserted...");

temp.update
(queryAddress, new Object[]{customer.getAddress().getId(),
customer.getAddress().getAddress(),
customer.getAddress().getCountry()});
System.out.println("Address Object Inserted...");
	}

}
