package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC421_Maximum_xor_Of_Two_Numbers_In_An_ArrayTest {
	LC421_Maximum_xor_Of_Two_Numbers_In_An_Array test = new LC421_Maximum_xor_Of_Two_Numbers_In_An_Array();

	@Test
	public void test(){
		assertEquals(28, test.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
	}
}