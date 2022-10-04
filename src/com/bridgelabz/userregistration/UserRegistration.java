package com.bridgelabz.userregistration;

import java.util.regex.Pattern;
import com.bridgelabz.exception.UserInputInvalidException;
import com.bridgelabz.utils.Constants;

public class UserRegistration {
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isValidFirstName("Ram"));
	}
	
	public boolean isValidFirstName(String name) {
		if (UserRegistration.isValidInput(Constants.FIRST_NAME_REGEX, name))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + name);
	}

	private static boolean isValidInput(String regex, String userInput) {
		return Pattern.matches(regex, userInput);
	}

}
