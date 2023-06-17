package com.dal.dbtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PropsMain {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dbprops.xml");

		MyDbConnection db = (MyDbConnection) context.getBean("db");
		System.out.println(db.getUrl() + " " + db.getUname() + " " + db.getPassword());
		MyDbConnection.getMyConnection();
	}
}
