package com.tzy.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterCoach implements Coach {

	
	private Service service;
	
	
	@Override
	public String showService() {
		return this.service.getService();
		
	}

	//method injection test. This method will be implemented always
	@Autowired
	@Qualifier("testService")
	public void testAnnotation(Service service) {
		
		System.out.println("entered the testAnnotation function of SetterCoach bean");
		this.service = service;
	}
	

	public Service getService() {
		return service;
	}



}
