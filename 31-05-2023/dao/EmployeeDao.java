package com.ddl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ddl.model.Employee;
import com.ddl.util.MyDbConnection;

public class EmployeeDao {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	private transient Scanner sc = new Scanner(System.in);
	public void insertEmployee(Employee emp) {
		
		con =MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("insert into DALEMP values(?,?)");
			ps.setInt(1, emp.getEno());
			ps.setString(2, emp.getEname());
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got inserted into DB successfully!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public void showEmployee() {
		con =MyDbConnection.getMyConnection();
		try {
			stmt =con.createStatement();
			rs =stmt.executeQuery("select * from dalemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void updateEmployee(Employee emp) {	
		con =MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("update DALEMP set ename=? where empno=? ");
			ps.setString(1, emp.getEname());
			ps.setInt(2, emp.getEno());
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got updated into DB successfully!");
		}

		catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	public void deleteEmployee(Employee emp) {
		con = MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("delete from DALEMP where empno=? ");
			ps.setInt(1, emp.getEno());
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got deleted into DB successfully!");
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
