package com.kenandrew.java.helpers;

import java.util.regex.Pattern;

public class StringUtils {

	public static boolean isNull(String s) {
		boolean ret = false;
		if (s == null) {
			ret = true;
		}
		return ret;
	}

	public static boolean isEmpty(String s) {
		boolean ret = false;
		if (s == null) {
			ret = true;
		} else if (s.length() == 0) {
			ret = true;
		} else if ("".equalsIgnoreCase(s)) {
			ret = true;
		}

		return ret;
	}

	public static boolean isAlpha(String s) {
		s.trim();
		boolean ret = true;
		if (s.matches("^.*[^a-zA-Z ].*$")) {
			ret = false;
		}
		return ret;
	}

	public static boolean isNumeric(String s) {
		boolean ret = true;
		if (s.matches("^.*[^0-9].*$")) {
			ret = false;
		}
		return ret;
	}

	public static boolean isAlphaNumeric(String s) {
		boolean ret = true;
		if (s.matches("^.*[^a-zA-z0-9].*$")) {
			ret = false;
		}
		return ret;
	}

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuffer().append(str).reverse().toString());
	}
}
