package com.springstudy.service.impl;

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
	
}
