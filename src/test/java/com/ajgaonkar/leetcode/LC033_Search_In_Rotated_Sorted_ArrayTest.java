package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC033_Search_In_Rotated_Sorted_ArrayTest {
	LC033_Search_In_Rotated_Sorted_Array test = new LC033_Search_In_Rotated_Sorted_Array();
	@Test
	public void test(){
		assertEquals(4, test.search(new int[]{4,5,6,7,0,1,2}, 0));
		assertEquals(6, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 3));
		assertEquals(4, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 1));
		assertEquals(1, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 6));
		assertEquals(3, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 8));
		assertEquals(0, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 5));
		assertEquals(7, test.search(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 4));
	}
}