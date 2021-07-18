package com.cybersoft.java12.springdemo.repository;

import com.cybersoft.java12.springdemo.container.IoCContainer;
import com.cybersoft.java12.springdemo.dbconnection.DatabaseConnection;

public class AuthorRepository {
	private DatabaseConnection dbConnection;
	
	public AuthorRepository()
	{
		dbConnection = (DatabaseConnection) IoCContainer.getBean("pgConnection");
	}
	
	public void getAuthor()
	{
		dbConnection.getConnection();
	}
}