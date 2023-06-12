package com.ddl.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.ddl.model.Employee;
import com.ddl.dao.EmployeeDao;

public class EmployeeController implements EmployeeInterface{

	private transient Scanner sc = new Scanner(System.in);
	Employee emp;
	List<Employee>  emplist = new ArrayList();
	
		EmployeeDao empdao = new EmployeeDao();
		
		public void addEmployee() {
		emp = new Employee();
		System.out.println("enter emp num");
		int eno = sc.nextInt();
		emp.setEno(eno);
		System.out.println("enter emp name");
		String ename = sc.next();
		emp.setEname(ename);
		emplist.add(emp);
	}
		
		
		public void viewEmployee() {
			//System.out.println(e.getEno());
			//System.out.println(e.getEname());	
			
	
			//System.out.println(emplist);
			
			Iterator<Employee> i = emplist.iterator();
			while(i.hasNext()){
			System.out.println(i.next());
			}
		}
		
		public void serial() {
			try{
				//Employee emp = new Employee();
			
				FileOutputStream fos = new FileOutputStream("dedalus.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(emplist);
				System.out.println("Serilized to file dedalus.txt");
				oos.close();
				fos.close();
				}
				catch(FileNotFoundException fnf)
				{
					System.out.println("No file");
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void deserial() {
			try{
				
				
				FileInputStream fis = new FileInputStream("dedalus.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				//Employee e = (Employee)ois.readObject();
				emplist = (ArrayList<Employee>) ois.readObject();

				System.out.println("DeSerialized from file dedalus.txt");
				System.out.println(emplist);
				
				emplist.forEach(emp -> {
					System.out.println("Employee No : " + emp.getEno()+ " " +"Employee Name : "+  emp.getEname());
				});
				ois.close();
				fis.close();
				}
				catch(FileNotFoundException fnf)
				{
					System.out.println("No file");
				}
				catch(ClassNotFoundException cnf)
				{
					System.out.println("No Emp class");
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		public void insertEmployee() {
			empdao.insertEmployee(emp);
			System.out.println("Inserted successfully");

		}
		public void showEmployee() {
			empdao.showEmployee();

	}
		
		public void updateEmployee() {
			System.out.println("Enter the employee number to update: ");
			int eno = sc.nextInt();
			
			System.out.println("Enter new employee name to update");
			String ename = sc.next();
			emp.setEname(ename);
			emp.setEno(eno);
			empdao.updateEmployee(emp);
			
					}
		
		public void deleteEmployee() {
			System.out.println("Enter the employee number to delete: ");
			int eno = sc.nextInt();
			emp.setEno(eno);
			empdao.deleteEmployee(emp);
		}
		
		public void sortEmployee() {
			System.out.println("Sort by name(1) or sort by Eno(2)?");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				Collections.sort(getEmplist(),Employee.nameComparator);
				empdao.sortEmployee(ch);
			}
			else {
				Collections.sort(getEmplist());
				empdao.sortEmployee(ch);
			}
		
		}


		private List<Employee> getEmplist() {
			// TODO Auto-generated method stub
			return emplist;
		}
}

