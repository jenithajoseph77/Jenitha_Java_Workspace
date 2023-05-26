package com.ddl.model;

import java.io.Serializable;
import java.util.List;

import com.ddl.controller.EmployeeController;

public class Employee implements Serializable {
	private int eno;
	private String ename;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(List emplist) {
		
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}

	
	
}
