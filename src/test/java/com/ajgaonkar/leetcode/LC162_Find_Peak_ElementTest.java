package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC162_Find_Peak_ElementTest {
	LC162_Find_Peak_Element test = new LC162_Find_Peak_Element();

	@Test
	public void test(){
		assertEquals(2, test.findPeakElement(new int[]{1,2,3,1}));
		assertEquals(1, test.findPeakElement(new int[]{1,2,1,3,5,6,4}));
		assertEquals(4, test.findPeakElement(new int[]{1,2,3,4,5}));
		assertEquals(0, test.findPeakElement(new int[]{5,4,3,2,1}));
		assertEquals(0, test.findPeakElement(new int[]{-2147483648}));
	}
}