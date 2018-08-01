package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC703_Kth_Largest_Element_In_A_StreamTest {

	@Test
	public void test(){
		int k = 3;
		int[] arr = new int[]{4,5,8,2};
		LC703_Kth_Largest_Element_In_A_Stream kthLargest = new LC703_Kth_Largest_Element_In_A_Stream(3, arr);
		assertEquals(4, kthLargest.add(3));
		assertEquals(5, kthLargest.add(5));
		assertEquals(5, kthLargest.add(10));
		assertEquals(8, kthLargest.add(9));
		assertEquals(8, kthLargest.add(4));
	}
}