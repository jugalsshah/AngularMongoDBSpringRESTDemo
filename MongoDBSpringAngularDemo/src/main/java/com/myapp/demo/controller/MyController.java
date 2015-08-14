package com.myapp.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * @jugal
 * 
 * */

@Controller
///@RequestMapping(value = "/")
public class MyController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getPage(){
		return  "redirect:/rest";
	}
	
	@RequestMapping(value = "/rest")
	public ModelAndView getHome(ModelMap model, HttpServletRequest httpServletRequest){
		
		return new ModelAndView("index");
	}
	@RequestMapping(value = "/rest/books", method =  RequestMethod.GET)
	public ModelAndView getDetailBook(ModelMap model, HttpServletRequest httpServletRequest){
		
		return new ModelAndView("showBook");
	}
	@RequestMapping(value = "/rest/books/*", method =  RequestMethod.GET)
	public ModelAndView getDetailBookByName(ModelMap model, HttpServletRequest httpServletRequest){
		
		return new ModelAndView("bookDetails");
	}
	
}
