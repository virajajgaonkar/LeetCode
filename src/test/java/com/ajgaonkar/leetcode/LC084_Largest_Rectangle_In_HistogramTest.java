package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC084_Largest_Rectangle_In_HistogramTest {
	LC084_Largest_Rectangle_In_Histogram test = new LC084_Largest_Rectangle_In_Histogram();

	@Test
	public void test1(){
		assertEquals(10, test.largestRectangleArea(new int[] {2,1,5,6,2,3}));
		assertEquals(10, test.largestRectangleArea(new int[] {1,2,2,3,5,6}));
		assertEquals(10, test.largestRectangleArea(new int[] {6,5,3,2,2,1}));
		assertEquals(9, test.largestRectangleArea(new int[] {0,1,1,1,0,2,2,2,0,3,4,5}));
	}
}