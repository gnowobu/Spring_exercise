package com.tzy.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class TestService implements Service {

	@Override
	public String getService() {
		
		return "das ist test service";
	}

}
