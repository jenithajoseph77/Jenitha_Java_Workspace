package com.ddl.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import com.ddl.controller.EmployeeController;

public class Employee implements Comparable<Employee>,Serializable{
	private int eno;
	private String ename;

	
	public Employee() {
	super();
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
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		
		@Override 
		public int compare(Employee e1, Employee e2) {
			return e1.getEname().compareTo(e2.getEname());
		}
	};

	public int compareTo(Employee otherEmployee) {
		return this.ename.compareTo(otherEmployee.getEname());
	}
	
}
