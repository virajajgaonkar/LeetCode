package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC448_Find_All_Numbers_Disappeared_In_An_ArrayTest {
	LC448_Find_All_Numbers_Disappeared_In_An_Array test = new LC448_Find_All_Numbers_Disappeared_In_An_Array();
	@Test
	public void test(){
		List<Integer> expected = Arrays.asList(5,6);
		List<Integer> actual = test.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
		assertEquals(actual, expected);
	}
	@Test
	public void test2(){
		List<Integer> expected = Arrays.asList(1,3,4,5);
		List<Integer> actual = test.findDisappearedNumbers(new int[]{2,2,2,2,2});
		assertEquals(actual, expected);
	}
}