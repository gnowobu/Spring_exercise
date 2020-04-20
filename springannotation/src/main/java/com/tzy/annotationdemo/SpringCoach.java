package com.tzy.annotationdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringCoach implements Coach {
	
	@Autowired
	@Qualifier("qualifyService")//default name begins with lowercase
	private Service service ;
	
	//inject dependency for constructor
	/*@Autowired
	public SpringCoach(Service service) {
		this.service = service;
	}
	*/
	
	@PostConstruct
	public void testAnnotation() {
		System.out.println("right after construction");
	}
	
	@Override
	public String showService() {
		
		return service.getService();
	}

}
