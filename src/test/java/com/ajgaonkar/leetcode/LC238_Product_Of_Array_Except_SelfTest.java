package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC238_Product_Of_Array_Except_SelfTest {
	LC238_Product_Of_Array_Except_Self test = new LC238_Product_Of_Array_Except_Self();

	@Test
	public void test(){
		assertArrayEquals(new int[]{24,12,8,6}, test.productExceptSelf(new int[]{1,2,3,4}));
		assertArrayEquals(new int[]{16,16,16,16,16}, test.productExceptSelf(new int[]{2,2,2,2,2}));
		assertArrayEquals(new int[]{72,48,36,48,72}, test.productExceptSelf(new int[]{2,3,4,3,2}));
	}
}