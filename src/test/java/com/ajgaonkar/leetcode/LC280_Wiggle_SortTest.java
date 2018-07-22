package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC280_Wiggle_SortTest {
	LC280_Wiggle_Sort test = new LC280_Wiggle_Sort();

	@Test
	public void test(){
		int[] arr = new int[]{3,5,2,1,6,4};
		test.wiggleSort(arr);
		assertArrayEquals(new int[]{3,5,1,6,2,4}, arr);
	}

}