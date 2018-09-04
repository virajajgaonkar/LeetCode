package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


public class LC476_Number_Complement_2Test {
	LC476_Number_Complement_2 test = new LC476_Number_Complement_2();

	@Test
	public void test(){
		assertEquals(2, test.findComplement(5));
		assertEquals(0, test.findComplement(1));
	}
}