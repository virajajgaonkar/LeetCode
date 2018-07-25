package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC039_Combination_SumTest {
	LC039_Combination_Sum test = new LC039_Combination_Sum();

	@Test
	public void test(){
		List<List<Integer>> actual = test.combinationSum(new int[]{2,3,6,7}, 7);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(7),
				Arrays.asList(2,2,3)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

	@Test
	public void test2(){
		List<List<Integer>> actual = test.combinationSum(new int[]{2,3,5}, 8);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(2,2,2,2),
				Arrays.asList(2,3,3),
				Arrays.asList(3,5)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}




}