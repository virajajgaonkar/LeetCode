package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC125_Valid_PalindromeTest {
	LC125_Valid_Palindrome test = new LC125_Valid_Palindrome();
	@Test
	public void test(){
		assertEquals(true, test.isPalindrome("A man, a plan, a canal: Panama"));
		assertEquals(false, test.isPalindrome("race a car"));
		assertEquals(false, test.isPalindrome("0P"));
	}
}