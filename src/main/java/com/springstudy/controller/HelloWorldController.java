package com.springstudy.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springstudy.service.HelloWorldService;
import com.springstudy.vo.CustomVo;

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
	
	@RequestMapping(value="/main")
	public String main() {
		
		return "/main/main";	
	}
	
//	@RequestMapping(value="/testpage")
//	public ModelAndView testpage() {
//		
//		String temp = "korea"; 
//		
//		String test2 = helloService.getTest2(); 
//		HashMap testMap = helloService.getTest4(); 
//		List<HashMap> testList = helloService.getTest5(); 
//		
//		ModelAndView model = new ModelAndView("/testpage/test1");
//		model.addObject("test", "testvalue");
//		model.addObject("test2", test2);
//		model.addObject("temp", temp); 
//		model.addObject("testMap", testMap); 
//		model.addObject("testList", testList); 
//
//		return model;
//	}
	
	@RequestMapping(value="/logintest")
	public ModelAndView logintest() {
		
		
		ModelAndView model = new ModelAndView("/testpage/logintest");
		
		return model;
	}
	
//	@RequestMapping(value="/loginproc")
//	public ModelAndView loginproc(HttpServletRequest req) {
//		
//		String userId = req.getParameter("userid");
//		String password = req.getParameter("password");
//		
//		System.out.println("uesrID --->"+ userId); 
//		System.out.println("password --->"+ password); 
//		
//		ModelAndView model = new ModelAndView("/testpage/logintest");
//		
//		return model;
//	}
	
//	@RequestMapping(value="/loginproc")
//	public ModelAndView loginproc(@RequestParam(value="userid") String userid, @RequestParam(value="password") String password) {
//		
//		System.out.println("uesrID --->"+ userid); 
//		System.out.println("password --->"+ password); 
//		
//		ModelAndView model = new ModelAndView("/testpage/logintest");
//		
//		return model;
//	}
	
//	@RequestMapping(value="/loginproc")
//	public ModelAndView loginproc(CustomVo customVo) {
//		
//		System.out.println("uesrID --->"+ customVo.getUserid()); 
//		System.out.println("password --->"+ customVo.getPassword()); 
//		
//		ModelAndView model = new ModelAndView("/testpage/logintest");
//		
//		return model;
//	}
	
	@RequestMapping(value="/loginproc")
	public ModelAndView loginproc(@RequestParam HashMap paramMap) {
		
		
		
		
		System.out.println("uesrID --->"+ paramMap.get("userid")); 
		System.out.println("password --->"+ paramMap.get("password")); 
		
			ModelAndView model = new ModelAndView("/testpage/logintest");
		
		return model;
	}
	
	

	
	
	@RequestMapping(value="/testpage")
	public ModelAndView testpage() {
		
		
		HashMap testMap = helloService.getTest4(); 
		
		ModelAndView model = new ModelAndView("/testpage/test1");
		model.addObject("test", "testvalue");
		model.addObject("testMap", testMap); 

		
		
		return model;
	}
	
	
	
	
}
