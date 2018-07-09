package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC001_Two_SumTest {
	LC001_Two_Sum test = new LC001_Two_Sum();
	@Test
	public void test(){
		assertArrayEquals(new int[]{0, 1}, test.twoSum(new int[]{2, 7, 11, 15}, 9));
		assertArrayEquals(new int[]{3, 4}, test.twoSum(new int[]{1, 5, 7, 9, 11, 14, 16, 20}, 20));
	}
}