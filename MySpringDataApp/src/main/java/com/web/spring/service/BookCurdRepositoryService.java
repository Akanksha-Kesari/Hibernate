package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.model.Book;
import com.web.spring.repository.BookCurdRepository;

@Service
public class BookCurdRepositoryService {

	@Autowired
	private BookCurdRepository bcr;

	public List<Book> findAll() {
		List<Book> book = new ArrayList<Book>();
		for (Book b : bcr.findAll()) {
			book.add(b);
		}
		return book;

	}

	public void addBook(Book b) {
		bcr.save(b);
	}
}
