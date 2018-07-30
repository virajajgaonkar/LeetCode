package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC034_Find_First_And_Last_Position_Of_Element_In_Sorted_ArrayTest {
	LC034_Find_First_And_Last_Position_Of_Element_In_Sorted_Array_2 test = new LC034_Find_First_And_Last_Position_Of_Element_In_Sorted_Array_2();

	@Test
	public void test(){
		assertArrayEquals(new int[]{3,4}, test.searchRange(new int[]{5,7,7,8,8,10}, 8));
		assertArrayEquals(new int[]{-1,-1}, test.searchRange(new int[]{5,7,7,8,8,10}, 6));
		assertArrayEquals(new int[]{0,0}, test.searchRange(new int[]{5,7,7,8,8,10}, 5));
		assertArrayEquals(new int[]{5,5}, test.searchRange(new int[]{5,7,7,8,8,10}, 10));
		assertArrayEquals(new int[]{5,5}, test.searchRange(new int[]{5,7,7,8,8,9,10}, 9));
	}


}