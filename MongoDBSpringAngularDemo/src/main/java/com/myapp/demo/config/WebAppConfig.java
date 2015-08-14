//package com.myapp.demo.config;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;

/*
 * @jugal
 * 
 * */

//
//@Configuration
//public class WebAppConfig implements WebApplicationInitializer{
//
//	public void onStartup(ServletContext servletContext) throws ServletException {
//         
//        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//        annotationConfigWebApplicationContext.register(AppConfig.class);
//        annotationConfigWebApplicationContext.setServletContext(servletContext);
//         
//        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigWebApplicationContext));
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//    }
//
//}
