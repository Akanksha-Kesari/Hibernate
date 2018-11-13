package com.web.spring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import com.web.spring.model.Book;
public interface BookOwnRepository extends Repository<Book, Integer> {
	
//@Query(value="SELECT * FROM Book b WHERE b.author = ?1" ,nativeQuery=true )//native query
	// Spring Data derive query automatically using it's own convention
	//@Query( value="SELECT b FROM Book b WHERE b.author = ?1")//JPQL quires
	Book findByName(String name);
	
	@Query("SELECT b.name ,b.price FROM Book b WHERE b.author = ?1")
	String projection(String name);
	
	List<Book> findByAuthorOrName(String author, String name);
	List<Book> findByNameIgnoreCase(String name);
	Long countByName(String name);
	
	@Query(value = "SELECT * FROM book b where  b.author = ?1 AND b.name = ?2", nativeQuery = true)
    public List<Book> findByAuthorAndName(String author, String name);

List<Book> findByAuthorOrderByNameAsc(String author);

@Query(value = "select * from book", nativeQuery = true)
List<Book> getProj();

@Query("select DISTINCT b.name FROM Book b")
List<Book> distBook();

@Query("SELECT b FROM Book b WHERE b.price > :p")
List<Book> getBook(@Param("p") int p);


}
