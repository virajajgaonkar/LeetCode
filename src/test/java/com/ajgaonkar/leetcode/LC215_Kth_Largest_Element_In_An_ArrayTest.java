package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC215_Kth_Largest_Element_In_An_ArrayTest {
	LC215_Kth_Largest_Element_In_An_Array test = new LC215_Kth_Largest_Element_In_An_Array();

	@Test
	public void test(){
		assertEquals(5, test.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
		assertEquals(4, test.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
	}
}