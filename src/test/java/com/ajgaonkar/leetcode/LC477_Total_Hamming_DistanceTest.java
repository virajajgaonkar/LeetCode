package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC477_Total_Hamming_DistanceTest {
	LC477_Total_Hamming_Distance test = new LC477_Total_Hamming_Distance();

	@Test
	public void test(){
		assertEquals(2, test.totalHammingDistance(new int[]{2, 4}));
		assertEquals(8, test.totalHammingDistance(new int[]{2, 2, 4, 4}));
		assertEquals(6, test.totalHammingDistance(new int[]{4, 14, 2}));
	}
}