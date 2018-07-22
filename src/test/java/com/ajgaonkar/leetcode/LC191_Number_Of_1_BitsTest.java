package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC191_Number_Of_1_BitsTest {
	LC191_Number_Of_1_Bits test = new LC191_Number_Of_1_Bits();

	@Test
	public void test(){
		assertEquals(3 , test.hammingWeight(11));
		assertEquals(1 , test.hammingWeight(128));
	}
}