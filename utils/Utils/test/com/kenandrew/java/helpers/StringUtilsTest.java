package com.kenandrew.java.helpers;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testIsNull() {
		String s = null;
		assertTrue(StringUtils.isNull(s));
	}
	
	@Test
	public void testIsNotNull() {
		String s = "Hello";
		assertFalse(StringUtils.isNull(s));
	}

	@Test
	public void testIsEmpty() {
		String s = "";
		assertTrue(StringUtils.isEmpty(s));
	}

	@Test
	public void testIsAlpha() {
		String s = "X x";
		assertTrue(StringUtils.isAlpha(s));
	}
	@Test
	public void testIsNotAlpha() {
		String s = "XXX Ñ";
		assertFalse(StringUtils.isAlpha(s));
	}
	
	@Test
	public void testIsNotAlphaWithNumber() {
		String s = "XXX3";
		assertFalse(StringUtils.isAlpha(s));
	}

	@Test
	public void testIsNumeric() {
		String s = "0123";
		assertTrue(StringUtils.isNumeric(s));
	}
	@Test
	public void testIsNotNumeric() {
		String s = "012XXX";
		assertFalse(StringUtils.isNumeric(s));
	}
	
	@Test
	public void testIsNotNumericWithAlpha() {
		String s = "XXX3";
		assertFalse(StringUtils.isNumeric(s));
	}
	
	@Test
	public void testIsPalindrome() {
		String s = "noon";
		assertTrue(StringUtils.isPalindrome(s));
	}
	
	@Test
	public void testIsNotPalindrome() {
		String s = "palindrome";
		assertFalse(StringUtils.isPalindrome(s));
	}
}
