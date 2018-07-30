package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LC090_Subsets_iiTest {
	LC090_Subsets_ii test = new LC090_Subsets_ii();
	//LC090_Subsets_ii_2 test = new LC090_Subsets_ii_2();

	@Test
	public void test(){
		List<List<Integer>> actual = test.subsetsWithDup(new int[]{1,2,2});
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(2),
				Arrays.asList(1),
				Arrays.asList(1,2,2),
				Arrays.asList(2,2),
				Arrays.asList(1,2),
				Arrays.asList()
		);
		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}