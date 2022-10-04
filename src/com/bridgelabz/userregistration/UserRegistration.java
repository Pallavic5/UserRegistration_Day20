package com.bridgelabz.userregistration;

import java.util.regex.Pattern;
import com.bridgelabz.exception.UserInputInvalidException;
import com.bridgelabz.utils.Constants;

public class UserRegistration {
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isValidFirstName("Pallavi"));
		System.out.println(user.isValidLastName("Punewar"));
		System.out.println(user.isValidEmail("pallavic23@gmail.com"));
		System.out.println(user.isValidEmail("pallavic23@gmail.com"));
		System.out.println(user.isValidMobile_Number("91 9538463948"));
	}
	
	public boolean isValidFirstName(String name) {
		if (UserRegistration.isValidInput(Constants.FIRST_NAME_REGEX, name))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + name);
	}
	
	public boolean isValidLastName(String name) {
		if (UserRegistration.isValidInput(Constants.FIRST_NAME_REGEX, name))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + name);
	}
	
	public boolean isValidEmail(String email) {
		if (UserRegistration.isValidInput(Constants.EMAIL_REGEX, email))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + email);
	}
	
	public boolean isValidMobile_Number(String mobilenum) {
		if (UserRegistration.isValidInput(Constants.MOBILE_NUM_REGEX, mobilenum))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + mobilenum);
	}


	private static boolean isValidInput(String regex, String userInput) {
		return Pattern.matches(regex, userInput);
	}

}
