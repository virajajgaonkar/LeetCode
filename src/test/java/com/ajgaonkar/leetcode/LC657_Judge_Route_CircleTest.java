package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC657_Judge_Route_CircleTest {
	LC657_Judge_Route_Circle test = new LC657_Judge_Route_Circle();

	@Test
	public void test(){
		assertEquals(true, test.judgeCircle("UD"));
		assertEquals(false, test.judgeCircle("LL"));
		assertEquals(true, test.judgeCircle("ULDR"));
	}
}