package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC010_Regular_Expression_MatchingTest {
	LC010_Regular_Expression_Matching test = new LC010_Regular_Expression_Matching();
	@Test
	public void test(){
		assertEquals(false, test.isMatch("aa", "a"));
		assertEquals(true, test.isMatch("aa", "a*"));
		assertEquals(true, test.isMatch("ab", ".*"));
		assertEquals(true, test.isMatch("aab", "c*a*b"));
		assertEquals(false, test.isMatch("mississippi", "mis*is*p*."));
	}
}