package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC336_Palindrome_PairsTest {
	LC336_Palindrome_Pairs test = new LC336_Palindrome_Pairs();

	@Test
	public void test(){
		assertEquals(Arrays.asList(Arrays.asList(0,1), Arrays.asList(1, 0), Arrays.asList(3,2), Arrays.asList(2,4))  , test.palindromePairs(new String[] {"abcd","dcba","lls","s","sssll"}));
		assertEquals(Arrays.asList(Arrays.asList(0,1), Arrays.asList(1, 0)), test.palindromePairs(new String[] {"bat","tab","cat"}));
	}
}