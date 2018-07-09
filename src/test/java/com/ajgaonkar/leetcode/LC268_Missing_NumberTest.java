package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC268_Missing_NumberTest {
	LC268_Missing_Number test = new LC268_Missing_Number();

	@Test
	public void test(){
		assertEquals(2, test.missingNumber(new int[]{3,0,1}));
		assertEquals(8, test.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
	}
}