package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC050_Pow_X_NTest {
	@Test
	public void test(){
		LC050_Pow_X_N test = new LC050_Pow_X_N();
		assertEquals(0.001, test.myPow(10, -3), 0.0001);
		assertEquals(1024, test.myPow(2, 10), 0);
		assertEquals(9.26100, test.myPow(2.1, 3), 0.0001);
		assertEquals(0.25000, test.myPow(2, -2), 0);
		assertEquals(2.543114507074558E-5, test.myPow(34.00515, -3), 0);
	}
}