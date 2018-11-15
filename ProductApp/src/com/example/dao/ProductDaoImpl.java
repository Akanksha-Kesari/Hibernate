package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Product;

public class ProductDaoImpl implements ProductDao{
    ArrayList<Product> alist=new ArrayList<Product>();
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		alist.add(p);
		
	}
	@Override
	public List<Product> productList() {
		// TODO Auto-generated method stub
		return alist;
	}

}
