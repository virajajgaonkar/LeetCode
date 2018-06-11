package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC066_Plus_One2Test {
	LC066_Plus_One2 test = new LC066_Plus_One2();
	@Test
	public void test() {
		assertArrayEquals(test.plusOne(new int[]{}), new int[]{1});
		assertArrayEquals(test.plusOne(new int[]{4,3,2,1}), new int[]{4,3,2,2});
		assertArrayEquals(test.plusOne(new int[]{9,9,9,9}), new int[]{1, 0,0,0,0});
		assertArrayEquals(test.plusOne(new int[]{4,3,2,9}), new int[]{4,3,3, 0});
	}
}