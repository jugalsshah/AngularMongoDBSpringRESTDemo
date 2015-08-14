package com.myapp.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection =	"books")
public class Book {

	@Id
	private int bookID;
	private String book_name;
	private String book_author;
	private String book_price;
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookID, String book_name, String book_author, String book_price){
		this.book_author=book_author;
		this.book_name=book_name;
		this.bookID= bookID;
		this.book_price= book_price;
	}
	
	public int getBookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getBook_name() {
		return book_name;
	}
	
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public String getBook_author() {
		return book_author;
	}
	
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	public String getBook_price() {
		return book_price;
	}
	
	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

