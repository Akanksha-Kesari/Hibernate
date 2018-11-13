package com.web.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.web.spring.model.Book;
import com.web.spring.repository.BookOwnRepository;
@Service
public class BookRepositoryService {
	@Autowired
	private BookOwnRepository br;
// Find by Name
	public Book findByName(String str) {
		return br.findByName(str);
	}
	public List<Book> findByNameIgnoreCase(String name) {
		return br.findByNameIgnoreCase(name);
	}

	// Find by Author or Name
	public List<Book> findByNameOrAuthor(String author, String name) {
		return br.findByAuthorOrName(author, name);
	}
		// Count Total by name
	public Long countByName(String name) {
		return br.countByName(name);
	}

	// Author and Name
	public List<Book> findByAuthorAndName(String author, String name) {

		return br.findByAuthorAndName(author, name);
	}
	
	public List<Book> findByAuthorOrderByNameAsc(String author)
	{
		return br.findByAuthorOrderByNameAsc(author);
	}
	
	public List<Book> getProj()
	{
		return br.getProj();
	}
	
	public String projection(String name)
	{
		return br.projection(name);
	}
		
	public List<Book> distBook()
	{
		return br.distBook();
	}

	public List<Book> getBook(int p)
	{
		return br.getBook(p);
	}

}
