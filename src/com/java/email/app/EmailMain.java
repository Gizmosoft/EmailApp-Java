package com.java.email.app;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EmailMain extends Thread{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		Email e = new Email();
		System.out.println("Enter your First Name: ");
		String fname = sc.nextLine();
		e.setFirstname(fname);
		System.out.println("Enter your Last Name: ");
		String lname = sc.nextLine();
		e.setLastname(lname);
		System.out.println("Enter your Department (ENTER 'UNASSIGNED' IN CASE YOU DON'T BELONG TO ANY DEPARTMENT): ");
		String dept = sc.nextLine();
		e.setDepartment(dept);
		
		Thread.sleep(1000);
		System.out.println("Generating your Enterprise Email ID....");
		Thread.sleep(2500);
		String email = e.setUtilityNames(dept).toLowerCase() + "." + e.getFirstname().toLowerCase() + "." + e.getLastname().toLowerCase() + e.getCompanysuffix();
		e.setEmail(email);
		
		System.out.println("EMAIL CREATED FOR: " + e.getFirstname().toUpperCase() + " " + e.getLastname().toUpperCase());
		System.out.println("Email: " + e.getEmail());
		
		Thread.sleep(1000);
		System.out.println("We are generating a Secure Password for you. Please wait...");
		Thread.sleep(2000);
		
		e.setPassword(e.generateRandomPassword());
		System.out.println("Your Password for this Email Account is: " + e.getPassword());
	}
}
