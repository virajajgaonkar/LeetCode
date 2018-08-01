package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC392_Is_SubsequenceTest {
	LC392_Is_Subsequence test = new LC392_Is_Subsequence();

	@Test
	public void test(){
		assertEquals(true, test.isSubsequence("abc", "ahbgdc"));
		assertEquals(true, test.isSubsequence("abc", "abc"));
		assertEquals(false, test.isSubsequence("axc", "ahbgdc"));
		assertEquals(false, test.isSubsequence("abc", "ab"));
	}
}