package com.tzy.annotationdemo;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.tzy.annotationdemo") //scan the package
public class JavaConfigdetail {
	
	@Bean
	public Coach noxmlCoach() {
		NoxmlCoach noxmlCoach = new NoxmlCoach(qualifyService());
		return noxmlCoach;
	}
	
	@Bean
	public Service testService() {
		return new TestService();
	}
	
	@Bean
	public Service qualifyService() {
		return new QualifyService();
	}
}
