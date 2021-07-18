package com.cybersoft.java12.springdemo.dbconnection;

public class MySqlConnection implements DatabaseConnection{

	@Override
	public void getConnection()
	{
		System.out.println("Get MySql Connection");
	}

}
