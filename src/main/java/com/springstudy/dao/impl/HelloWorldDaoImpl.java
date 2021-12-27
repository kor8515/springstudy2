package com.springstudy.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springstudy.dao.HelloWorldDao;

@Repository("HelloWorldDao")
public class HelloWorldDaoImpl implements HelloWorldDao{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("helloworld.getTest");
	}

}
