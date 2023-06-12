package com.ddl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {

	static Connection con; 
	private static MyDbConnection instance = null;

	
	private MyDbConnection() {
		
	}
	
	public static MyDbConnection getInstance() {
		if(instance == null) {
			instance = new MyDbConnection();
		}
		return instance;
	}
	
	public static Connection getMyConnection() {

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Manager1");
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMyConnection());
	}
}
