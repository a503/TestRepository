package com.mycompany.myapp.dao;

import org.springframework.stereotype.Component;

@Component
public class Exam10DAOImpl implements Exam10DAO{
	@Override
	public void insert(){
		System.out.println("insert()-exam10dao 실행");
	}
	@Override
	public void select(){
		System.out.println("select()-exam10dao 실행");
	}
}
