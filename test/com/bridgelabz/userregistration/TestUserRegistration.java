package com.bridgelabz.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.exception.UserInputInvalidException;

public class TestUserRegistration {

	@Test
	public void testFirstNameStartsWithCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("Ram"));
	}

	@Test(expected = UserInputInvalidException.class)
	public void testFirstNameStartsWithoutCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("ram"));
	}

}
