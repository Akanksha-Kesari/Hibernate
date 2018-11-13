package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Book;
import com.web.spring.service.BookCurdRepositoryService;

@RestController
public class SpringRestCurdRepo {

	@Autowired
	private BookCurdRepositoryService bcrs;

	@RequestMapping(value = "my")
	public String greet() {
		return "Welcome to Spring Data JPA";
	}

	@RequestMapping(value = "books", method = RequestMethod.GET, produces = "application/json")
	public List<Book> getBooks() {
		return bcrs.findAll();
	}

	@RequestMapping(value="addbook" ,method=RequestMethod.POST)
	public String addBook(@RequestParam int id, @RequestParam String name, @RequestParam String author,
			@RequestParam int price) {
		Book b = new Book(id, name, author, price);
		bcrs.addBook(b);
      return "book added";
	}
	
}
