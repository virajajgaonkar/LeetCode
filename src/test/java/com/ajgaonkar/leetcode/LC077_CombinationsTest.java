package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class LC077_CombinationsTest {
	LC077_Combinations test = new LC077_Combinations();

	@Test
	public void test(){
		List<List<Integer>> actual = test.combine(4,2);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(2,4),
				Arrays.asList(3,4),
				Arrays.asList(2,3),
				Arrays.asList(1,2),
				Arrays.asList(1,3),
				Arrays.asList(1,4)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}