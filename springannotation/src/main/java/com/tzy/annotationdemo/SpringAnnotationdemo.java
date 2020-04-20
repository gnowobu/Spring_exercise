package com.tzy.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAnnotationdemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("springCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.showService());
		
		// close the context
		context.close();
		
	}

}
