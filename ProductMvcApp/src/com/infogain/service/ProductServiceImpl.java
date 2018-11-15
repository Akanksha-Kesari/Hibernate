package com.infogain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.dao.ProductDao;
import com.infogain.model.Product;

@Service("productservice")
public class ProductServiceImpl implements ProductService {
   @Autowired
	ProductDao productdao;
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		productdao.addProduct(p);
	}
	@Override
	public List<Product> productList() {
		// TODO Auto-generated method stub
		return productdao.productList();
	}
	
	

}
