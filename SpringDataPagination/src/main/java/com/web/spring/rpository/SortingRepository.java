package com.web.spring.rpository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.web.spring.model.Book;
public interface SortingRepository extends PagingAndSortingRepository<Book, Integer> {
	
}
