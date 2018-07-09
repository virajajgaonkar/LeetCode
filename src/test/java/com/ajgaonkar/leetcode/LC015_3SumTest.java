package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC015_3SumTest {
	LC015_3Sum test = new LC015_3Sum();
	@Test
	public void test(){
		int[] input = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(-1, -1, 2));
		result.add(Arrays.asList(-1, 0, 1));
		assertEquals(result, test.threeSum(input));
	}

	@Test
	public void test1(){
		int[] input = new int[]{1,-1,-1,0};
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(-1, 0, 1));
		assertEquals(result, test.threeSum(input));
	}
}