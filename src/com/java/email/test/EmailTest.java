package com.java.email.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.java.email.app.Email;

@TestInstance(Lifecycle.PER_CLASS)
class EmailTest {
	Email e = null;
	
	@BeforeAll
	void instantiateEmail() {
		e = new Email();
	}
	
	@Test
	void testGenerateRandomPassword() {
		System.out.println("Random pass: " + e.generateRandomPassword());
	}

	@Test
	void testGenerateRandomNumber() {
		System.out.println("Random num " + e.generaterandomNumber());
	}
	
	@Test
	void testGenerateAlphaASCII() {
		System.out.println("Alphabet ASCII " + e.generateAlphaASCII());
	}
	
	@Test
	void testGenerateSpecialASCII() {
		System.out.println("Special ASCII " + e.generateSpecialASCII());
	}
}
