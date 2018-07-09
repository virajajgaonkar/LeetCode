package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC088_Merge_Sorted_ArrayTest {
	LC088_Merge_Sorted_Array test = new LC088_Merge_Sorted_Array();
	@Test
	public void test(){
		int[] a1 = new int[]{1,2,3,0,0,0};
		int[] a2 = new int[]{2,5,6};
		test.merge(a1, 3, a2, 3);
		assertArrayEquals(new int[]{1,2,2,3,5,6}, a1);
	}

}