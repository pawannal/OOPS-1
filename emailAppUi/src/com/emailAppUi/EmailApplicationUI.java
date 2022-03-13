package com.emailAppUi;

import com.email.app.service.employee;
public class EmailApplicationUI {

	public void init() {

		employee employee = buildUI(); //[1] [2]
		callService(employee);	 // [3]	
	}
	
	private employee buildUI() {
		
		buildWelcomeSection();		
		employee employee =	buildEmployeeDetailsSection();		
		return employee;
	}
	
	private void buildWelcomeSection() {

		System.out.println("*********************************");
		System.out.println("Welcome to Email Application !!!!");
		System.out.println("*********************************");
				
	}
}