package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC496_Next_Greater_Element_iTest {
	LC496_Next_Greater_Element_i test = new LC496_Next_Greater_Element_i();

	@Test
	public void test(){
		assertArrayEquals(new int[]{-1, 3, -1}, test.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
		assertArrayEquals(new int[]{3, -1}, test.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
	}
}