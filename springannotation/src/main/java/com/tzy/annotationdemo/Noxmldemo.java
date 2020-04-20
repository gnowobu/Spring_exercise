package com.tzy.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Noxmldemo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfigdetail.class);
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("noxmlCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.showService());
		
		// close the context
		context.close();
		
	}
}
