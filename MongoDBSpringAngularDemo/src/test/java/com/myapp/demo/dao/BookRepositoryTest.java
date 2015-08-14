package com.myapp.demo.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.demo.config.AppConfig;
import com.myapp.demo.model.Book;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration
public class BookRepositoryTest {

	public static final String COLLECTION_NAME = "books";
	@Autowired
	BookRepository bookRepository;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testAddBook() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetBookByID() {
	
	List<Book> b = bookRepository.getAllbooks();
	for(Book as:b){
		System.out.println(as.getBook_author()+""+as.getBook_name());
		
	}
//	System.out.println(b.);
	}

//	@Test
//	public void testGetAllbooks() {
//		fail("Not yet implemented");
//	}

}
