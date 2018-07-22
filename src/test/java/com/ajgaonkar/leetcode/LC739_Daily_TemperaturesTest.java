package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC739_Daily_TemperaturesTest {
	LC739_Daily_Temperatures test = new LC739_Daily_Temperatures();

	@Test
	public void test(){
		assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, test.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
		assertArrayEquals(new int[]{2, 1, 0}, test.dailyTemperatures(new int[]{60, 59, 61}));
	}
}