package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LC128_Longest_Consecutive_SequenceTest {
	LC128_Longest_Consecutive_Sequence test = new LC128_Longest_Consecutive_Sequence();

	@Test
	public void test() {
		assertEquals(4, test.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
	}
}