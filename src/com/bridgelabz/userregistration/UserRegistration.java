package com.bridgelabz.userregistration;

import java.util.ArrayList;
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
		System.out.println(user.isValidMobile_Number_WithoutSpace("919538463948"));
		System.out.println(user.isValidMobile_Number("91953"));
		System.out.println(user.isValidPassword("pallavic"));
		System.out.println(user.isValidPasswordRule2("pallaviC"));
		System.out.println(user.isValidPasswordRule3("pallavi4"));
		System.out.println(user.isValidPasswordRule4("pc19NRR@"));
		System.out.println(user.isValidEmails("abc@yahoo.com"));
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
	
	public boolean isValidMobile_Number_WithoutSpace(String mobilenum) {
		if (UserRegistration.isValidInput(Constants.MOBILE_NUM_REGEX_NEW, mobilenum))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + mobilenum);
	}

	public boolean isValidPassword(String password) {
		if (UserRegistration.isValidInput(Constants.PASSWORD_REGEX, password))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + password);
	}
	
	public boolean isValidPasswordRule2(String password) {
		if (UserRegistration.isValidInput(Constants.PASSWORD_REGEX, password))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + password);
	}
	
	public boolean isValidPasswordRule3(String password) {
		if (UserRegistration.isValidInput(Constants.PASSWORD_REGEX, password))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + password);
	}
	
	public boolean isValidPasswordRule4(String password) {
		if (UserRegistration.isValidInput(Constants.PASSWORD_REGEX, password))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + password);
	}
	
	public boolean isValidEmails(String email) {
		if (UserRegistration.isValidInput(Constants.EMAIL_REGEX_PATTERN, email))
			return true;
		else
			throw new UserInputInvalidException("Invalid username: " + email);
	}
	
	ArrayList<String> emailList = new ArrayList<>();
    public void addEmail(){
        emailList.add("abc@yahoo.com");
        emailList.add("abc-100@yahoo.com");
        emailList.add("abc111@abc.com");
        emailList.add("abc-100@abc.net");
        emailList.add("abc.100@abc.com.au");
        emailList.add("abc@1.com");
        emailList.add("abc@gmail.com.com");
        emailList.add("abc@abc+100@gmail.com");
    }

	public static boolean isValidInput(String regex, String userInput) {
		return Pattern.matches(regex, userInput);
	}

}
