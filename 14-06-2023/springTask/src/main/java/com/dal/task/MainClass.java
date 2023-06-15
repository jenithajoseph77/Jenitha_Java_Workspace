package com.dal.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("message.xml");
		Message msg = (Message) context.getBean("msg");
		msg.display();
		System.out.println(msg.display());
	}
}
