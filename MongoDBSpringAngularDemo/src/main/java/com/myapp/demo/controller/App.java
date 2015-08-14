package com.myapp.demo.controller;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.demo.dao.BookRepository;
import com.myapp.demo.model.Book;

//import com.myapp.demo.config.AppConfig;
//import com.myapp.demo.dao.BookRepository;
//import com.myapp.demo.model.Book;


/*
 * @jugal
 * 
 * */

@RestController
@RequestMapping(value = "/rest")
public class App {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	@RequestMapping(value="/addbook/{id}/{bookname}/{bookauthor}/{bookprice}", method=RequestMethod.POST ,headers="Accept=application/json"	)
	@ResponseBody
	public void addBook(@PathVariable int id,
			@PathVariable String bookname,
			@PathVariable String bookauthor,
			@PathVariable String bookprice){
		
		Book b= new Book();
		b.setBookID(id);
		b.setBook_name(bookname);
		b.setBook_author(bookauthor);
		b.setBook_price(bookprice);
		//System.out.println(b.getBook_author()+b.getBook_name()+b.getBook_price());
		bookRepository.addBook(b);
		//return bookRepository.getAllbooks();
		
	}
	
	@RequestMapping(value="/books" , method=RequestMethod.GET, headers="Accept=application/json")
	public List<Book> getAllBook(){
		
		List<Book> books = bookRepository.getAllbooks();
		return books;
	}
	
	//@SuppressWarnings("unchecked")
	@RequestMapping(value="/books/{book_name}" , method=RequestMethod.GET, headers="Accept=application/json")
	public String getBookByName(@PathVariable("book_name") String book_name){
		
		Book b=  bookRepository.getBookByID(book_name);
		
		return "book _author::->"+b.getBook_author()+"\n"+"book_name::->"+b.getBook_name()+"\n"+"book_price::->"+b.getBook_price();
	}

}
