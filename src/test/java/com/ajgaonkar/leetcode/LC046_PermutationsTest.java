package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC046_PermutationsTest {
	//LC046_Permutations test = new LC046_Permutations();
	LC046_Permutations_2 test = new LC046_Permutations_2();

	@Test
	public void test(){
		List<List<Integer>> actual = test.permute(new int[]{1,2,3});
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(1,3,2),
				Arrays.asList(2,1,3),
				Arrays.asList(2,3,1),
				Arrays.asList(3,1,2),
				Arrays.asList(3,2,1)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}