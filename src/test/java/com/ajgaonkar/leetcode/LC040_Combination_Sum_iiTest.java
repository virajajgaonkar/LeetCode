package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC040_Combination_Sum_iiTest {
	LC040_Combination_Sum_ii test = new LC040_Combination_Sum_ii();

	@Test
	public void test(){
		List<List<Integer>> actual = test.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1,7),
				Arrays.asList(1,2,5),
				Arrays.asList(2,6),
				Arrays.asList(1,1,6)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

	@Test
	public void test2(){
		List<List<Integer>> actual = test.combinationSum2(new int[]{2,5,2,1,2}, 5);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1,2,2),
				Arrays.asList(5)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}