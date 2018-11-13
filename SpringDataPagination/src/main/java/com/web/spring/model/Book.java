package com.web.spring.model;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@javax.persistence.Entity
@Table(name = "Book")
@XmlRootElement(name = "BookDetails")
public class Book {
	@Id
	int bookId;
	String name;
	String author;
	int price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int bookId, String name, String author, int price) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book() {

	}

	@Override
	public String toString() {
	return "Book Id " + bookId + " Name " + name +
			" Author Name is  " + author + " Price " + price;
	}
}
