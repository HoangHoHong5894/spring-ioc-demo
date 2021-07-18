package com.cybersoft.java12.springdemo.container;

import org.apache.logging.log4j.status.StatusConsoleListener;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import com.cybersoft.java12.springdemo.dbconnection.DbDataSource;
import com.cybersoft.java12.springdemo.dbconnection.MySqlConnection;
import com.cybersoft.java12.springdemo.dbconnection.PgConnection;
import com.cybersoft.java12.springdemo.repository.AuthorRepositoryImpl;

public class IoCContainer {
	private static MySqlConnection mySqlConnection = null;
	private static PgConnection pgConnection = null;
	private static DbDataSource dbDataSource = null;
	private static AuthorRepositoryImpl authorRepository = null;

	public static Object getBean(String beanName)
	{
		switch (beanName) {
		case "mySqlConnection":
			return getMySqlConnection();
		case "pgConnection":
			return getPgConnection();
		case "dataSource":
			return getDataSource();
		case "author":
			return getAuthRepository();
		default:
			break;
		}
		return null;
	}

	private static Object getAuthRepository() {
		return   authorRepository == null? new AuthorRepositoryImpl() : authorRepository;
	}

	private static Object getDataSource() {
		return   dbDataSource == null? new DbDataSource("","","") : dbDataSource;
	}

	private static Object getPgConnection() {
		return pgConnection == null 
				? new PgConnection((DbDataSource) getDataSource()) 
				: pgConnection;
	}

	private static Object getMySqlConnection() {
		return mySqlConnection == null 
				? new MySqlConnection((DbDataSource) getDataSource()) 
				: mySqlConnection;
	}
}
