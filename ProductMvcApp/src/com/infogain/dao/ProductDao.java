package com.infogain.dao;

import java.util.List;

import com.infogain.model.Product;

public interface ProductDao {

	public void addProduct(Product p);
	public List<Product> productList();
}
