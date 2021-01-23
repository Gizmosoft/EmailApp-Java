package com.java.email.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.java.email.app.Email;

@TestInstance(Lifecycle.PER_CLASS)
class EmailTest {

	@Test
	void testGenerateRandomNumber() {
		Email e = new Email("FNAME", "LNAME");
		System.out.println(e.generaterandomNumber());
	}

}
