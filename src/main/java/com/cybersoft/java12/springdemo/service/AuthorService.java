package com.cybersoft.java12.springdemo.service;

import com.cybersoft.java12.springdemo.container.IoCContainer;
import com.cybersoft.java12.springdemo.repository.AuthorRepository;

public class AuthorService {

	/*
	 * Hay cai dat code sao cho lop AuthorService
	 * co the su dung AuthorRepository ma khong bi phu
	 * thuoc vao module cap thap
	 * */
	
	private AuthorRepository repository;
	
	
	
	public AuthorService() {
		this.repository = (AuthorRepository) IoCContainer.getBean("author");
	}

}
