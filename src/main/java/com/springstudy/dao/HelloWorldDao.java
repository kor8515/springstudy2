package com.springstudy.dao;

import java.util.HashMap;
import java.util.List;

public interface HelloWorldDao {

	String getTest();
	
	String getTest2();
	
	String getTest3(String temp);
	
	HashMap getTest4();
	
	List<HashMap> getTest5();
	
	int getTest6();
	
	int getTest7();
	int getTest8();

	
	String getTest9(String temp,String temp2);
	
	HashMap loginInfo(HashMap user);



	
}
