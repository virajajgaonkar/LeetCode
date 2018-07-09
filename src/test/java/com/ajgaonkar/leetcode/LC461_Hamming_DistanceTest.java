package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC461_Hamming_DistanceTest {
	LC461_Hamming_Distance test = new LC461_Hamming_Distance();
	@Test
	public void test(){
		assertEquals(2, test.hammingDistance(2, 4));
	}
}