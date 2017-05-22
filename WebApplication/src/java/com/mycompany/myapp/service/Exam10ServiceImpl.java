package com.mycompany.myapp.service;

import com.mycompany.myapp.dao.Exam10DAO;
import org.springframework.beans.factory.annotation.Autowired;

public class Exam10ServiceImpl implements Exam10Service{
	@Autowired
	private Exam10DAO exam10Dao;
	
	@Override
	public void join(){
		System.out.println("join() 실행");
		exam10Dao.insert();
	}
	@Override
	public void login(){
		System.out.println("login() 실행");
		exam10Dao.select();
	}
}
