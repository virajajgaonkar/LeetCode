package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC010_Regular_Expression_Matching_2Test {
	LC010_Regular_Expression_Matching_2 test = new LC010_Regular_Expression_Matching_2();
	@Test
	public void test(){
		assertEquals(true, test.isMatch("x", "xa*b*"));
		assertEquals(true, test.isMatch("xa", "xa*b*"));
		assertEquals(true, test.isMatch("xab", "xa*b*"));
		assertEquals(true, test.isMatch("xaab", "xa*b*"));
		assertEquals(true, test.isMatch("xabb", "xa*b*"));
		assertEquals(true, test.isMatch("xaabb", "xa*b*"));
		assertEquals(true, test.isMatch("xaaaabbbb", "xa*b*"));

		assertEquals(false, test.isMatch("a", "xa*b*"));
		assertEquals(false, test.isMatch("ab", "xa*b*"));
		assertEquals(false, test.isMatch("aab", "xa*b*"));
		assertEquals(false, test.isMatch("abb", "xa*b*"));
		assertEquals(false, test.isMatch("aabb", "xa*b*"));
		assertEquals(false, test.isMatch("aaaabbbb", "xa*b*"));

		assertEquals(false, test.isMatch("xaba", "xa*b*"));
		assertEquals(false, test.isMatch("xabab", "xa*b*"));

		assertEquals(true, test.isMatch("ab", ".*"));
	}

}