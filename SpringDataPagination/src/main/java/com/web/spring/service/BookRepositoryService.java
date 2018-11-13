package com.web.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.web.spring.model.Book;
import com.web.spring.rpository.SortingRepository;
@Service
public class BookRepositoryService {
	@Autowired
	private SortingRepository sr;
	private final static int PAGESIZE = 2;
		public Iterable<Book> findAllBooks() {
		return sr.findAll();
	}
			
	public List<Book> getPage(int pageNumber) {
		PageRequest request = new PageRequest(pageNumber, PAGESIZE, Sort.Direction.DESC, "bookId");
		
		return sr.findAll(request).getContent();
	}

	}