package com.bridgelabz.utils;

public class Constants {
	public final static String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
	public final static String EMAIL_REGEX = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
	public final static String MOBILE_NUM_REGEX = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
	public final static String MOBILE_NUM_REGEX_NEW = "^[91]+[6-9]{1}[0-9]{9}$";
	public final static String PASSWORD_REGEX = "^[a-z0-9A-Z@]{8,}$";
	public final static String EMAIL_REGEX_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
}
