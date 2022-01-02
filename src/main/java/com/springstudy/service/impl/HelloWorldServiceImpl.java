package com.springstudy.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springstudy.dao.HelloWorldDao;
import com.springstudy.service.HelloWorldService;

@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService{

	@Resource(name = "HelloWorldDao")
    private HelloWorldDao helloWorldDao;

	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest();
//		return "";
	}

	@Override
	public String getTest2() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest2();
	}

	@Override
	public String getTest3(String temp) {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest3(temp);
	}

	@Override
	public HashMap getTest4() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest4();
	}

	@Override
	public List<HashMap> getTest5() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest5();
	}
	@Override
	public int getTest6() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest6();
	}
	@Override
	public int getTest7() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest7();
	}
	
	@Override
	public int getTest8() {
		// TODO Auto-generated method stub
		return helloWorldDao.getTest8();
	}

	@Override
	public String getTest9(String temp) {
		// TODO Auto-generated method stub
		return null;
	}
	HashMap<String,String> map1 = new HashMap<String,String>();
	@Override
	public HashMap loginInfo(String userid, String password) {
		// TODO Auto-generated method stub
		
		HashMap loginmap = new HashMap();
		loginmap.put("user",userid);
		loginmap.put("userpw", password);
		
		
		return helloWorldDao.loginInfo(loginmap);
		
	}
	
	
}
