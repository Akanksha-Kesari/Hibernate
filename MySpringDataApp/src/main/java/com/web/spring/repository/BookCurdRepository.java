package com.web.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.spring.model.Book;

public interface BookCurdRepository extends CrudRepository<Book, Integer> {

}
