package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC326_Power_Of_ThreeTest {
	LC326_Power_Of_Three test = new LC326_Power_Of_Three();

	@Test
	public void test(){
		assertEquals(true, test.isPowerOfThree(27));
		assertEquals(false, test.isPowerOfThree(0));
		assertEquals(true, test.isPowerOfThree(9));
		assertEquals(false, test.isPowerOfThree(45));
		assertEquals(true, test.isPowerOfThree(1));
		assertEquals(false, test.isPowerOfThree(-3));
		assertEquals(false, test.isPowerOfThree(2147483647));
	}

	@Test
	public void test2(){
		assertEquals(true, test.isPowerOfThree2(27));
		assertEquals(false, test.isPowerOfThree2(0));
		assertEquals(true, test.isPowerOfThree2(9));
		assertEquals(false, test.isPowerOfThree2(45));
		assertEquals(true, test.isPowerOfThree2(1));
		assertEquals(false, test.isPowerOfThree2(-3));
		assertEquals(false, test.isPowerOfThree2(2147483647));
	}

	@Test
	public void test1(){
		assertEquals(true, test.isPowerOfThree1(27));
		assertEquals(false, test.isPowerOfThree1(0));
		assertEquals(true, test.isPowerOfThree1(9));
		assertEquals(false, test.isPowerOfThree1(45));
		assertEquals(true, test.isPowerOfThree1(1));
		assertEquals(false, test.isPowerOfThree1(-3));
		assertEquals(false, test.isPowerOfThree1(2147483647));
	}

	@Test
	public void test3(){
		assertEquals(true, test.isPowerOfThree3(27));
		assertEquals(false, test.isPowerOfThree3(0));
		assertEquals(true, test.isPowerOfThree3(9));
		assertEquals(false, test.isPowerOfThree3(45));
		assertEquals(true, test.isPowerOfThree3(1));
		assertEquals(false, test.isPowerOfThree3(-3));
		assertEquals(false, test.isPowerOfThree3(2147483647));
	}

}