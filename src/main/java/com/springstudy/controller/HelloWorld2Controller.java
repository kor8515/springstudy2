package com.springstudy.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springstudy.service.HelloWorldService;

@Controller
public class HelloWorld2Controller {

	@Resource(name="HelloWorldService")
	private HelloWorldService helloService;
	
	@RequestMapping(value="/home2")
	public String home2() {
		
		String test2 = helloService.getTest2(); 
		
		System.out.println("test2 :::"+ test2); 
		
		return "home";
	}
	
	@RequestMapping(value="/home3")
	public String home3() {
		
		String varTest = "PARK";
		
		String test2 = helloService.getTest3(varTest); 
		
		System.out.println("test2 :::"+ test2); 
		
		return "home";
	}
	
	@RequestMapping(value="/home4")
	public String home4() {
				
		HashMap test2 = helloService.getTest4(); 
		
		System.out.println("test2 :::"+ test2.get("MANAGER_NM").toString()); 
		System.out.println("test2 :::"+ test2.get("PW_DAMO").toString()); 
		System.out.println("test2 :::"+ test2.get("TEL_NO").toString()); 

		return "home";
	}
	
	@RequestMapping(value="/home5")
	public String home5() {
				
		List<HashMap> test2 = helloService.getTest5(); 
		
		for(int i =0 ; i < test2.size(); i++) {
			HashMap temp = test2.get(i);
			
			System.out.println("test2 :::"+ temp.get("MANAGER_NM").toString()); 
			System.out.println("test2 :::"+ temp.get("PW_DAMO").toString()); 
			System.out.println("test2 :::"+ temp.get("TEL_NO").toString()); 
		}
		return "home";
	}
	

	
	
	
}
