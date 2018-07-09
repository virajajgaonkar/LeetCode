package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC028_Implement_StrstrTest {
	LC028_Implement_Strstr test = new LC028_Implement_Strstr();

	@Test
	public void test(){
		assertEquals(0, test.strStr("a", "a"));
		assertEquals(2, test.strStr("hello", "ll"));
		assertEquals(-1, test.strStr("aaaaa", "bba"));
		assertEquals(4, test.strStr("mississippi", "issip"));

		assertEquals(-1, test.strStr("aaa", "aaaa"));
		assertEquals(-1, test.strStr("mississippi", "issipi"));

	}

}