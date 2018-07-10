package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC043_Multiply_StringsTest {
	LC043_Multiply_Strings test = new LC043_Multiply_Strings();
	@Test
	public void test(){
		assertEquals("56088", test.multiply("123", "456"));
		assertEquals("30", test.multiply("5", "6"));
		assertEquals("0", test.multiply("0", "0"));
	}


}