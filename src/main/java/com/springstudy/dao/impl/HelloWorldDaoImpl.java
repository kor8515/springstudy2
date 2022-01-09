package com.springstudy.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	public String getTest3(@Param("temp")String temp) {
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

	@Override
	public int getTest6() {
		// TODO Auto-generated method stub
		return sqlSession.insert("helloworld.getTest6");
	}
	
	@Override
	public int getTest7() {
		// TODO Auto-generated method stub
		return sqlSession.update("helloworld.getTest7");
	}
	@Override
	public int getTest8() {
		// TODO Auto-generated method stub
		return sqlSession.delete("helloworld.getTest8");
	}
	
//	@Override
//	public String getTest9() {
//		// TODO Auto-generated method stub
//		return sqlSession.delete("helloworld.getTest8");
//	}


	@Override
	public String getTest9(String temp, String temp2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HashMap loginInfo(HashMap user) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("helloworld.loginInfo", user);
	}
	
	@Override
	public int InsertloginIp(HashMap user1) {
		// TODO Auto-generated method stub
		return sqlSession.insert("helloworld.InsertloginIp",user1);
	}
	

}
