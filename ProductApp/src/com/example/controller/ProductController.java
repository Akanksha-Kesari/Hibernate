package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.ProductDao;
import com.example.dao.ProductDaoImpl;
import com.example.model.Product;

@Controller
public class ProductController {
	
	ProductDao productDao=new ProductDaoImpl();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addProduct(Product p) {

		return new ModelAndView("addProduct", "command", new Product());

	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveProduct(Product p) {
           productDao.addProduct(p);
		return new ModelAndView("redirect:/products.html");

	}
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	
	public ModelAndView listProduct()
	{
		Map<String, Object> model=new HashMap<String,Object>();
		model.put("products", productDao.productList());
		
		return new ModelAndView("save",model);
	
	}
	

}
