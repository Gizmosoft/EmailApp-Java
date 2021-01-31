package com.java.email.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String department;
	private String email;
	private ArrayList<Character> password;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private static final String companySuffix = "@company.com";
	
	public Email() {
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department.toLowerCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public static String getCompanysuffix() {
		return companySuffix;
	}
	
	public String getPassword() {
		String[] pass = new String[this.password.size()];
		for(int j=0; j<this.password.size(); j++) {
			pass[j] = this.password.get(j).toString();
		}
		System.out.println(pass.toString());
		return pass.toString();
	}
	
	public void setPassword(ArrayList<Character> password) {
		this.password = password;
	}


	// Create short forms based on department
	public String setUtilityNames(String department) {
		if(department.toLowerCase().equals("unassigned"))
			return "contr";
		else {
			return department.substring(0, 3);
		}
	}
	
	// Generate random password --- Needs improvement
	public ArrayList<Character> generateRandomPassword() {
		int i = generaterandomNumber();
		ArrayList<Character> password = new ArrayList<Character>();
		
		for(int j=0; j<i-4; j++) {
			password.add((char)generateAlphaASCII());
		}
		
		for(int j=i-4; j<i; j++) {
			password.add((char)generateSpecialASCII());
		}
		return password;
	}
	
	// Public Methods to test and generate Random Numbers for password generation
	public static int generaterandomNumber() {
		return (int) (Math.random() * (15-8)) + 8; // generate random no. b/w 8 and 14
	}
	
	public static int generateAlphaASCII() {
		return (int) (Math.random() * (123-97)) + 97;
	}
	
	public static int generateSpecialASCII() {
		return (int) (Math.random() * (64-33)) + 33;
	}
	
	// Change Password
//	public void changePassword(String password) {
//		this.password = password;
//	}

}
