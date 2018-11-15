package com.infogain.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Product;
@Repository("productdao")
public class ProductDaoImpl implements ProductDao{
    @Autowired  
	SessionFactory factory;
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(p);
		t.commit();
		session.close();
	}
	@Override
	public List<Product> productList() {
		// TODO Auto-generated method stub
		return (List<Product>)factory.openSession().createCriteria(Product.class).list();
	}

}
