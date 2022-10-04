package com.bridgelabz.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.exception.UserInputInvalidException;

public class TestUserRegistration {

	@Test
	public void testFirstNameStartsWithCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("Pallavi"));
	}

	@Test(expected = UserInputInvalidException.class)
	public void testFirstNameStartsWithoutCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("p@ll@vi"));
	}
	
	@Test
	public void testLastNameStartsWithCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("Punewar"));
	}

	@Test(expected = UserInputInvalidException.class)
	public void testLastNameStartsWithoutCapAndHasMinimumThreeChar_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidFirstName("punewar"));
	}
	
	@Test
	public void testgivenEmail_WhenProper_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidEmail("pallavic23@gmail.com"));
    }
	
	@Test
	public void testgivenMobileNumber_WhenProper_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidMobile_Number("919538463948"));
    }
	
	@Test
	public void testgivenPassword_WhenProper_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidPassword("pallavic"));
    }
	
	

}
