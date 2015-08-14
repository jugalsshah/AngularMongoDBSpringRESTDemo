package com.myapp.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.myapp.demo.model.Book;



/*
 * @jugal
 * 
 * */


@Repository
public class BookRepository {
	
	public static final String COLLECTION_NAME = "books";
	
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public void addBook(Book book) {
	    if (!mongoTemplate.collectionExists(Book.class)) {
	      mongoTemplate.createCollection(Book.class);
	    }
	    mongoTemplate.insert(book, COLLECTION_NAME);
	  }
	
	 public Book getBookByID(String bookName) {
		    return mongoTemplate.findOne(
		      Query.query(Criteria.where("book_name").is(bookName)), Book.class, COLLECTION_NAME);
		  }
	
	public List<Book> getAllbooks() {
	    return mongoTemplate.findAll(Book.class, COLLECTION_NAME);
	  }

}
