package com.springstudy.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/home6")
	public String home6() {
		
		String varTest = "LIM";

		
		int test6 = helloService.getTest6(); 
		
		System.out.println("test2 :::"+ test6); 
		
		return "home";
	}
	@RequestMapping(value="/home7")
	public String home7() {
		
		
		int test7 = helloService.getTest7(); 
		
		System.out.println("test7 :::"+ test7); 
		
		return "home";
	}
	
	@RequestMapping(value="/home8")
	public String home8() {
		
		
		int test8 = helloService.getTest8(); 
		
		System.out.println("test8 :::"+ test8); 
		
		return "home";
	}
	
//	@RequestMapping(value="/home3")
//	public String home3() {
//		
//		String varID = "PARK";
//		String varPass=""
//		
//		String test9 = helloService.getTest9(varID); 
//		
//		System.out.println("test2 :::"+ test2); 
//		
//		return "home";
//	}

	
//	@RequestMapping(value="/login")
//	public ModelAndView longin() {
//		
//		ModelAndView model1 = new ModelAndView("/testpage/logintest2");
//		return model1;
//		
//	}
//	
//	@RequestMapping(value="/loginproc2")
//	public ModelAndView loginproc2(HttpServletRequest req) {
//		String userId = req.getParameter("userid");
//		String userPassword=req.getParameter("password");
//		
//		System.out.println(userId);
//		System.out.println(userPassword);
//		
//		HashMap loginInfo =helloService.loginInfo(userId,userPassword);
//		
//		ModelAndView view = null;
//		if(loginInfo != null) {
//			view = new ModelAndView("/testpage/a");
//			view.addObject("loginInfo", loginInfo);
//		}else {
//			view = new ModelAndView("/testpage/b");
//		}
//		
//		return view;
//		}
//	
		@RequestMapping(value="/login")
		public ModelAndView login() {
			ModelAndView model1= new ModelAndView("/testpage/logintest2");
			return model1;
		}
		@RequestMapping(value="/loginproc2")
		public ModelAndView loginproc2(HttpServletRequest req) {
			String userId = req.getParameter("userid");
			String userPw = req.getParameter("password");
			
			HashMap loginInfo =helloService.loginInfo(userId,userPw);
			
			ModelAndView view = null;
				
			if(loginInfo !=null){
				view = new ModelAndView("/testpage/a");
				view.addObject("loginInfo", loginInfo);
			}else {
				view = new ModelAndView("/testpage/b");
			}
			return view;
		}
	
	
}
