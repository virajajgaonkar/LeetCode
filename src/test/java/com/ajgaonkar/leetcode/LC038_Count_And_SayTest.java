package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC038_Count_And_SayTest {
	LC038_Count_And_Say test = new LC038_Count_And_Say();

	@Test
	public void test(){
		assertEquals("1", test.countAndSay(1));
		assertEquals("11", test.countAndSay(2));
		assertEquals("21", test.countAndSay(3));
		assertEquals("1211", test.countAndSay(4));
		assertEquals("111221", test.countAndSay(5));

		//assertEquals("", test.countAndSay(234));
	}
}