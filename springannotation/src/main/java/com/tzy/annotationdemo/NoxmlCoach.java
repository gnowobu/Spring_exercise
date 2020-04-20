package com.tzy.annotationdemo;

public class NoxmlCoach implements Coach{
	
	private Service service;

	public NoxmlCoach(Service service) {
		this.service = service;
		}

	@Override
	public String showService() {
		
		return service.getService();
		
	}
	

}
