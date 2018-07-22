package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC442_Find_All_Duplicates_In_An_ArrayTest {
	LC442_Find_All_Duplicates_In_An_Array test = new LC442_Find_All_Duplicates_In_An_Array();

	@Test
	public void test(){
		List<Integer> expected = Arrays.asList(2,3);
		List<Integer> actual = test.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
		assertEquals(expected, actual);
	}

	@Test
	public void test1(){
		int n = 10;
		for (int i=0; i<10; i++){
			n = -n;
			System.out.println(n);
		}
	}
}