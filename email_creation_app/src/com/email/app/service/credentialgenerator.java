/**package com.email.app.service;

import com.email.creation.app.employee;

public class credentialgenerator {
	private employee employee;
	private String generateEmailID;
	public credentialgenerator(employee e)
	{
		
		this.employee = employee;
	}
	
	public void generateEmailId()
	{
		String dept = deptShortName();
		String emailid = employee.getFirstname().toLowerCase()
				employee.getLastname().toLowerCase()+"@"
				+ dept +"gl.com";
	}
    }*/
    
    package com.email.app.service;

import com.email.creation.app.employee;
import java.util.Random;



public class credentialgenerator{

	private employee employee;
	
	private String generatedEmailID;
	private char[] generatedPassword = new char[8];
	
	public credentialgenerator(employee employee) {
		this.employee = employee;
	}
	
	public void generateEmailID() {
				
		String departmentShortName = getDepartmentShortName();	
		
		String emailID = employee.getFirstname().toLowerCase()
			+ "." + employee.getLastname().toLowerCase()
			+ "@" + departmentShortName + ".gl.com";				
		
//		employee.setEmailID(emailID);
		this.generatedEmailID = emailID;
	}

	private String getDepartmentShortName() {
		
		String departmentName = employee.getDepartnment();
		
		if (departmentName.equals("Technical")) {
			return "tech";
		}else if (departmentName.equals("Admin")) {
			return "adm";
		}else if (departmentName.equals("Human Resource")) {
			return "hr";
		}else if (departmentName.equals("Legal")) {
			return "lgl";
		}
		return "";
	}
	
	public void generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allValues = capitalLetters + smallLetters 
				+ numbers + specialCharacters;
		
		Random randomObj = new Random();			

//		int randomIndexForNumber = new Random().nextInt(10);
//		numbers.charAt(randomIndexForNumber);
		
		for (int i=0; i < 8; i++) {

			int boundValue = allValues.length();
			int randomIndex = randomObj.nextInt(boundValue);		
			char randomChar = allValues.charAt(randomIndex);			
			this.generatedPassword[i] = randomChar;
		}	
	}
	
	
	public void showCredentials() {

		System.out.print("Dear " + employee.getFirstname() + ", ");
		System.out.println("Your generated credentials are as follows");
		System.out.println("Email ID: " + generatedEmailID);
		System.out.print("Password: ");
		System.out.println(generatedPassword);
	}
	
}

