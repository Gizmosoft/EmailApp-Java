package com.java.email.app;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String department;
	private String email;
	private String password;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private static final String companySuffix = "@company.com";
	
	public static final Scanner sc = new Scanner(System.in);
	
	// Constructors to get firstname and lastname
	public Email(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		
		// call a method to ask for dept
		this.department = setDepartment();
		System.out.println(this.department);
		System.out.println(setUtilityNames(this.department));
		this.password = generateRandomPassword();
		System.out.println(this.password);
		
		email = setUtilityNames(this.department) + "." + firstname.toLowerCase() + "." + lastname.toLowerCase() + companySuffix;
		
		System.out.println("EMAIL CREATED FOR: " + this.firstname.toUpperCase() + " " + this.lastname.toUpperCase());
		System.out.println("Email: " + email);
	}
	
	// Ask for dept
	private String setDepartment() {
		System.out.println("Enter your Department (ENTER 'UNASSIGNED' IN CASE YOU DON'T BELONG TO ANY DEPARTMENT):\n");
		return sc.nextLine().toLowerCase();
	}
	
	// Create short forms based on department
	private String setUtilityNames(String department) {
		if(department.toLowerCase().equals("unassigned"))
			return "contr";
		else {
			return department.substring(0, 3);
		}
	}
	
	
	// Generate random password --- Needs improvement
	private String generateRandomPassword() {
		int i = generaterandomNumber();
		char[] password = new char[i];
		for(int j=0; j<i-4; j++) {
			password[j] = (char)generateAlphaASCII();
		}
		for(int j=i-4; j<i; j++) {
			password[j] = (char)generateSpecialASCII();
		}
		return password.toString();
	}
	
	// Public Methods to test and generate Random Numbers for password generation
	public static int generaterandomNumber() {
		return (int) (Math.random() * (15-8)) + 8;
	}
	
	public static int generateAlphaASCII() {
		return (int) (Math.random() * (123-97)) + 97;
	}
	
	public static int generateSpecialASCII() {
		return (int) (Math.random() * (64-33)) + 33;
	}

	
	// Set alternate Email and mailbox capacity
	public void setMailBoxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	public void setAlternateMail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	
	// Change Password
	public void changePassword(String password) {
		this.password = password;
	}

}
