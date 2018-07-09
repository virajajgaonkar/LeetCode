package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC026_Remove_Duplicates_From_Sorted_ArrayTest {
	LC026_Remove_Duplicates_From_Sorted_Array test = new LC026_Remove_Duplicates_From_Sorted_Array();

	@Test
	public void test(){
		assertEquals(2, test.removeDuplicates(new int[]{1,1,2}));
		assertEquals(2, test.removeDuplicates(new int[]{1,2}));
		assertEquals(5, test.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}
}