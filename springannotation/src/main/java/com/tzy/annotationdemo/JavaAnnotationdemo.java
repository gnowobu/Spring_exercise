package com.tzy.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationdemo {
	
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("springCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.showService());
		
		// close the context
		context.close();
		
	}
}
