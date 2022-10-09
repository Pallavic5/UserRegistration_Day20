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
	public void testgivenMobileNumber_WhenProperWithSpace_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidMobile_Number("91 9538463948"));
    }
	
	@Test(expected = UserInputInvalidException.class)
	public void testgivenMobileNumber_WhenProperWithOutSpace_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidMobile_Number_WithoutSpace("9538463948"));
    }
	
	@Test(expected = UserInputInvalidException.class)
	public void testgivenMobileNumber_WhenNotProper_ShouldReturnFalse_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidMobile_Number("91953"));
    }
	
	@Test
	public void testgivenPassword_WhenProper_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidPassword("pallavic"));
    }
	
	@Test
	public void testgivenPassword_WhenHaveAtleastOneUppercaseChar_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidPasswordRule2("pallaviC"));
    }
	
	@Test
	public void testgivenPassword_WhenHaveAtleastOneNumericNumber_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidPasswordRule3("pallavi4"));
    }
	
	@Test
	public void testgivenPassword_WhenHaveExactlyOneSpecialCharacter_ShouldReturnTrue_thenHappy() {
		UserRegistration user = new UserRegistration();
		assertTrue(user.isValidPasswordRule4("pc19NRR@"));
    }
	
	  @Test
	    public void givenEmail1_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(0));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail2_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(1));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail3_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(2));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail4_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(3));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail5_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(4));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail6_WhenProper_ShouldReturnTrue() {
	    	UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(5));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail7_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(6));
	        assertTrue(email);
	    }

	    @Test
	    public void givenEmail8_WhenProper_ShouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.addEmail();
	        boolean email = userRegistration.isValidEmails(userRegistration.emailList.get(7));
	        assertTrue(email);
	    }

	
	

}
