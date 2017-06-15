package com.mycompany.myapp.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.myapp.ApplicationContextLoader;
import com.mycompany.myapp.dao.Exam15Dao;

public class ServiceTest extends ApplicationContextLoader{
	@Autowired
	private Exam15Dao dao;
	
	@Test
	public void writeTest(){
		
	}
	@Test
	public void getTest(){
		
	}
}
