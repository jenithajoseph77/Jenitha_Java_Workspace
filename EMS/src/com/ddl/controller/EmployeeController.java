package com.ddl.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ddl.model.Employee;

public class EmployeeController implements EmployeeInterface{

	Scanner sc = new Scanner(System.in);
	Employee e;
	private List emplist = new ArrayList();
	
		
		public void addEmployee() {
		e = new Employee();
		System.out.println("enter emp num");
		int eno = sc.nextInt();
		e.setEno(eno);
		System.out.println("enter emp name");
		String ename = sc.next();
		e.setEname(ename);
		emplist.add(e);
	}
		
		
		public void viewEmployee() {
			//System.out.println(e.getEno());
			//System.out.println(e.getEname());	
			System.out.println(emplist);
		}
		
		public void serial() {
			try{
				Employee e1 = new Employee(emplist);
			
				FileOutputStream fos = new FileOutputStream("dedalus.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(e1);
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
				
				Employee emp = (Employee)ois.readObject();
				System.out.println("DeSerialized from file dedalus.txt");
				System.out.println(emplist);
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
		
}

