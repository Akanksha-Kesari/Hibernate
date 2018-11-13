package com.web.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.web.spring.model.Book;
import com.web.spring.service.BookRepositoryService;
@RestController
// @RequestMapping("rest")
public class SpringRestRepositoryController {
	@Autowired
	private BookRepositoryService bs;
	// find Book by name
	@RequestMapping(value = "/bookbyname", method = RequestMethod.GET,produces="application/json")
	public Book findByName(@RequestParam String str) {
		return bs.findByName(str);
	}
	@RequestMapping(value = "/booknamebyignorecase", method = RequestMethod.GET,produces="application/json")
	List<Book> findByNameIgnoreCase(@RequestParam String name) {
		return bs.findByNameIgnoreCase(name);
	}
	@RequestMapping(value = "countbook", method = RequestMethod.GET)
	public String bookCount(String name) {
		return "Total Book " + bs.countByName(name);
	}
	@RequestMapping(value = "nameandauthor", method = RequestMethod.GET)
	public List<Book> findBynameAndauthor(@RequestParam String author, @RequestParam String name) {
		return bs.findByAuthorAndName(author, name);
	}
	@RequestMapping(value="authororname",method = RequestMethod.GET)
	public List<Book> findByNameOrAuthor(String author, String name) {
		return bs.findByNameOrAuthor(author, name);
	}

	@RequestMapping(value="orderbyname",method = RequestMethod.GET)
	public List<Book> findByAuthorOrderByNameAsc(String author)
	{
		return bs.findByAuthorOrderByNameAsc(author);
	}
	
	@RequestMapping(value="proj",method = RequestMethod.GET)
	public List<Book> getProj()
	{
		return bs.getProj();
	}
	
	@RequestMapping(value="projection",method = RequestMethod.GET)
	public String projection(@RequestParam("name") String name)
	{
		return bs.projection(name);
	}
	
	@RequestMapping(value="distbook",method = RequestMethod.GET)
	public List<Book> distBook()
	{
		return bs.distBook();
	}
	
@RequestMapping(value="getbook",method = RequestMethod.GET)
	public List<Book> getBook(@RequestParam("p") int p)
	{
		return bs.getBook(p);
	}
	
	
}