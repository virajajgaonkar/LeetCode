package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC581_Shortest_Unsorted_Continuous_SubarrayTest {
	LC581_Shortest_Unsorted_Continuous_Subarray test = new LC581_Shortest_Unsorted_Continuous_Subarray();

	@Test
	public void test(){
		assertEquals(5, test.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
		assertEquals(0, test.findUnsortedSubarray(new int[]{}));
		assertEquals(0, test.findUnsortedSubarray(new int[]{1}));
		assertEquals(0, test.findUnsortedSubarray(new int[]{1,2}));
		assertEquals(2, test.findUnsortedSubarray(new int[]{2,1}));
		assertEquals(4, test.findUnsortedSubarray(new int[]{1,3,2,2,2}));
		assertEquals(3, test.findUnsortedSubarray(new int[]{2,3,3,2,4}));
	}

}