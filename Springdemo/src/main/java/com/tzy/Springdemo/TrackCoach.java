package com.tzy.Springdemo;

public class TrackCoach implements Coach {
	
	private TestService testService;
	private String email;
	
	public TrackCoach(TestService testService) {
		this.testService = testService;
	}
	
	public TrackCoach(){
		System.out.print("this is an empty constructor" + "\n");
	}	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}



	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getTest() {
		
		return testService.test();
	}
	

}










