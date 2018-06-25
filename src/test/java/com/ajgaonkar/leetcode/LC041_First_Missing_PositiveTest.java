package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC041_First_Missing_PositiveTest {
	LC041_First_Missing_Positive test = new LC041_First_Missing_Positive();
	@Test
	public void test(){
		assertEquals(3, test.firstMissingPositive(new int[]{1,2,0}));
		assertEquals(2, test.firstMissingPositive(new int[]{3,4,-1,1}));
		assertEquals(1, test.firstMissingPositive(new int[]{7,8,9,11,12}));
		assertEquals(1, test.firstMissingPositive(new int[]{90, 91, 92, 93}));
		assertEquals(1, test.firstMissingPositive(new int[]{}));
		assertEquals(2, test.firstMissingPositive(new int[]{1}));
		assertEquals(2, test.firstMissingPositive(new int[]{1,1}));
	}
}