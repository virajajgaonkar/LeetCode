package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudySorts_2Test {
	@Test
	public void test1(){
		int[] arr = new int[]{3,2,1,5,6,4};
		StudySorts_2.quickSort(arr);
		assertArrayEquals(new int[]{1,2,3,4,5,6}, arr);
	}

	@Test
	public void test2(){
		int[] arr = new int[]{3,2,3,1,2,4,5,5,6};
		StudySorts_2.quickSort(arr);
		assertArrayEquals(new int[]{1,2,2,3,3,4,5,5,6}, arr);
	}

}