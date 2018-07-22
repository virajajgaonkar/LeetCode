package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC231_Power_Of_TwoTest {
	LC231_Power_Of_Two test = new LC231_Power_Of_Two();

	@Test
	public void test(){
		assertEquals(true, test.isPowerOfTwo(1));
		assertEquals(true, test.isPowerOfTwo(16));
		assertEquals(false, test.isPowerOfTwo(218));
	}

}