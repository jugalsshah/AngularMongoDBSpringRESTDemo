package com.myapp.demo.config;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

public class AppConfigTest {

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

	@Test
	public void testMongoDbFactory() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("localhost",27017); 
	        new SimpleMongoDbFactory(mongoClient, "Book");
	}

//	@Test
//	public void testMongoTemplate() {
//MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(mongo, databaseName));
//	}

}
