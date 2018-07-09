package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC283_Move_ZeroesTest {
	LC283_Move_Zeroes test = new LC283_Move_Zeroes();
	@Test
	public void test(){
		int[] arr = new int[]{0,1,0,3,12};
		test.moveZeroes(arr);
		assertArrayEquals(new int[]{1,3,12,0,0}, arr);
	}

	@Test
	public void test2(){
		int[] arr = new int[]{0,0,0,1,0,0,0,3,12,0,0,0};
		test.moveZeroes(arr);
		assertArrayEquals(new int[]{1,3,12,0,0,0,0,0,0,0,0,0}, arr);
	}

	@Test
	public void test3(){
		int[] arr = new int[]{0,0,0,0,0,0,0,0,0};
		test.moveZeroes(arr);
		assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0}, arr);
	}

	@Test
	public void test4(){
		int[] arr = new int[]{1};
		test.moveZeroes(arr);
		assertArrayEquals(new int[]{1}, arr);
	}


}