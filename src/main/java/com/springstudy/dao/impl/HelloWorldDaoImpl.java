package com.springstudy.dao.impl;

import java.util.HashMap;
import java.util.List;

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


	@Override
	public String getTest2() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("helloworld.getTest2");
	}


	@Override
	public String getTest3(String temp) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("helloworld.getTest3", temp);
	}


	@Override
	public HashMap getTest4() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("helloworld.getTest4");
	}


	@Override
	public List<HashMap> getTest5() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("helloworld.getTest5");
	}

}
