package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC067_Add_BinaryTest {
	LC067_Add_Binary test = new LC067_Add_Binary();

	@Test
	public void test(){
		assertEquals("11110", test.addBinary("1111", "1111"));
		assertEquals("100", test.addBinary("11", "1"));
		assertEquals("10101", test.addBinary("1010", "1011"));
	}
}