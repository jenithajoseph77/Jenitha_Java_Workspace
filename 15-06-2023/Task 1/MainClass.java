package com.dal.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
			
			User user = (User)context.getBean("user");
			System.out.println(user.getUserName() + " has " + user.getCar().getName()+ " " + user.getCar().getModel()+ " "+user.getCar().getNumber());
		
	}
}
