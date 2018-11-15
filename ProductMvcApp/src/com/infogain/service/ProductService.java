package com.infogain.service;

import java.util.List;

import com.infogain.model.Product;

public interface ProductService {
	public void addProduct(Product p);
	public List<Product> productList();

}
