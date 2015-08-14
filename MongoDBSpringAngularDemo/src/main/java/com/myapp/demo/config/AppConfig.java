package com.myapp.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import org.springframework.web.servlet.view.JstlView;

//import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
        MongoClient mongoClient = new MongoClient("localhost",27017);
        return new SimpleMongoDbFactory(mongoClient, "Book");
    }
 
	@Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
//     
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setSuffix(".html");
//  
//        return viewResolver;
//    }

//	@Override
//	protected String getDatabaseName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Mongo mongo() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
