package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC047_Permutations_iiTest {
	LC047_Permutations_ii test = new LC047_Permutations_ii();
	//LC047_Permutations_ii_2 test = new LC047_Permutations_ii_2();

	@Test
	public void test(){
		List<List<Integer>> actual = test.permuteUnique(new int[]{1,1,2});
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1,1,2),
				Arrays.asList(1,2,1),
				Arrays.asList(2,1,1)
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}