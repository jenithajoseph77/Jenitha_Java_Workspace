package com.dal.dbtask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {

	static Connection con;
	private static MyDbConnection instance = null;
	private static String url;
	private static String uname;
	private static String password;

	public MyDbConnection() {

	}

	public MyDbConnection(String url, String uname, String password) {
		super();
		this.url = url;
		this.uname = uname;
		this.password = password;
	}

	public static Connection getMyConnection() {

		try {
			con = DriverManager.getConnection(url, uname, password);
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDbConnection [url=" + url + ", uname=" + uname + ", password=" + password + "]";
	}

}
