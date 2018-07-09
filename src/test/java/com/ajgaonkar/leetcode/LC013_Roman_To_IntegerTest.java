package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC013_Roman_To_IntegerTest {
	LC013_Roman_To_Integer test = new LC013_Roman_To_Integer();
	@Test
	public void test(){
		assertEquals(3, test.romanToInt("III"));
		assertEquals(4, test.romanToInt("IV"));
		assertEquals(9, test.romanToInt("IX"));
		assertEquals(58, test.romanToInt("LVIII"));
		assertEquals(1994, test.romanToInt("MCMXCIV"));
	}

}