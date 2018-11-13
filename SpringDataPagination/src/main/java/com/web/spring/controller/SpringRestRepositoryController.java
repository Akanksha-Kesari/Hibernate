package com.web.spring.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.web.spring.model.Book;
import com.web.spring.service.BookRepositoryService;
@RestController
public class SpringRestRepositoryController {
	@Autowired
	private BookRepositoryService bs;
	@RequestMapping("/findall")
	public List<Book> findAll() {
		List<Book> b=new ArrayList<Book>();

		for (Book book : bs.findAllBooks()) {
			b.add(book);
		}

		return b;
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> viewBooks(@RequestParam(name = "p", defaultValue = "0") 
	int pageNumber) {
		
		List<Book> books = bs.getPage(pageNumber);

				return books ;
	}

}