package com.email.creation.app;

public class employee {
	private String Firstname;
	private String Lastname;
	private String Departnment;
	
	public employee(String Firstname,String Lastname
			,String Departnment) {

		
		this.Firstname =  Firstname;
		this.Lastname = Lastname;
		this.Departnment = Departnment;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDepartnment() {
		return Departnment;
	}
	public void setDepartnment(String departnment) {
		Departnment = departnment;
	}
public static void main(String[] args) {
	
}
}


