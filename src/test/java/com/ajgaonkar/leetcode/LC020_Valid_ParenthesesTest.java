package com.ajgaonkar.leetcode;


import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LC020_Valid_ParenthesesTest {
	@Test
	public void testIsValid(){
		LC020_Valid_Parentheses test = new LC020_Valid_Parentheses();
		assertTrue(test.isValid("()"));
		assertTrue(test.isValid("({})[]"));
		assertTrue(test.isValid("({[]})"));

		assertFalse(test.isValid("({[})"));
		assertFalse(test.isValid("({][})"));
		assertFalse(test.isValid("({})]["));
	}
}