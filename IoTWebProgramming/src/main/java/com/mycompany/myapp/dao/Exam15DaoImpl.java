package com.mycompany.myapp.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Exam15Account;

@Component
public class Exam15DaoImpl implements Exam15Dao{
	@Autowired
	private SqlSessionTemplate template;

	@Override
	public Exam15Account selectByAno(String ano) {
		Exam15Account account = template.selectOne("account.selectByAno", ano);
		return account;
	}

	@Override
	public int update(Exam15Account account) {
		int row = template.update("account.update", account);
		return row;
	}

}
