package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface ProductDao {
	public void addProduct(Product p);
	public List<Product> productList();
	

}
