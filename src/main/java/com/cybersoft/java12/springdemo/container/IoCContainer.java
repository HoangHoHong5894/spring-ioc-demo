package com.cybersoft.java12.springdemo.container;

import com.cybersoft.java12.springdemo.dbconnection.DbDataSource;
import com.cybersoft.java12.springdemo.dbconnection.MySqlConnection;
import com.cybersoft.java12.springdemo.dbconnection.PgConnection;

public class IoCContainer {
	private static MySqlConnection mySqlConnection = null;
	private static PgConnection pgConnection = null;
	private static DbDataSource dbDataSource = null;

	public static Object getBean(String beanName)
	{
		switch (beanName) {
		case "mySqlConnection":
			return getMySqlConnection();
		case "pgConnection":
			return getPgConnection();
		case "dataSource":
			return getDataSource();
		default:
			break;
		}
		return null;
	}

	private static Object getDataSource() {
		return   dbDataSource == null? new DbDataSource("","","") : dbDataSource;
	}

	private static Object getPgConnection() {
		return   pgConnection == null? new PgConnection() : pgConnection;
	}

	private static Object getMySqlConnection() {
		return   mySqlConnection == null? new MySqlConnection() : mySqlConnection;
	}
}
