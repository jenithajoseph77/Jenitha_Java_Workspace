package com.ddl.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.ddl.controller.EmployeeController;
import com.ddl.model.Employee;

import com.ddl.exception.UserNotFoundException;

import com.ddl.controller.EmployeeInterface;

public class MainClass {
	public static void main(String[] args) {
		
		EmployeeController e = new EmployeeController();
		System.out.println("this is controller class");
		String ch = null;
		try {
			String un = null;
			String pwd = null;
			
			BiPredicate<String, String> validateUsernamePassword = (username, password) ->
		    username.equals("Jeni") && password.equals("pass");

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username");
			un = br.readLine();
			System.out.println("Enter Password");
			pwd = br.readLine();
		
		if (validateUsernamePassword.test(un, pwd)) {
		System.out.println("Welcome " + un);
		do {
		System.out.println("Enter option");
		System.out.println("1.Add");
		System.out.println("2.View");
		System.out.println("3.Serial");
		System.out.println("4.Serial");

		Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		
		switch(option) {
		case 1 :{
			System.out.println("Loading... Please wait.");
            Thread.sleep(2000);
			e.addEmployee();
		break;
		}
		case 2 :{
			System.out.println("Loading... Please wait.");
			Thread.sleep(2000);
			e.viewEmployee();
		
		break;}
		case 3:
		{
			System.out.println("Loading... Please wait.");
            Thread.sleep(2000);
			e.serial();
		break;
		}
		case 4:
		{
			System.out.println("Loading... Please wait.");
            Thread.sleep(2000);
			e.deserial();
		break;
		}
		
		default:{
			System.out.println("Enter valid option");
		}
			
		
		}
		System.out.println("want to continue? Y|y");
		ch=s.next();
		}while(ch.equals("Y")||ch.equals("y"));
		
			}
			
			else {
				throw new UserNotFoundException();
			}

		}

		catch (UserNotFoundException unf) {
			//System.out.println("From catch unf");
			//System.out.println(unf);
			unf.printStackTrace();
		}

		catch (Exception ae) {
			System.out.println("IO");
		} finally {
			System.out.println("Finally .....");
		}
		}
}
