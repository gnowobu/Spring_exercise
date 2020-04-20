package com.tzy.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class QualifyService implements Service {

	@Override
	public String getService() {
		
		return "wanna use @qualifier?";
	}

}
