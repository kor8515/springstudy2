package com.springstudy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springstudy.service.HelloWorldService;

@Controller
public class HelloWorldController {

	@Resource(name="HelloWorldService")
	private HelloWorldService helloService;
	
	@RequestMapping(value="/home")
	public String home() {
		
		String test1 = helloService.getTest(); 
		
		System.out.println("test1 :::"+ test1); 
		
		return "home";
	}
	

	
}
