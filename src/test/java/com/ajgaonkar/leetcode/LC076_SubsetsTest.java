package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LC076_SubsetsTest {
	//LC076_Subsets test = new LC076_Subsets();
	LC076_Subsets_2 test = new LC076_Subsets_2();

	@Test
	public void test(){
		List<List<Integer>> actual = test.subsets(new int[]{1,2,3});
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1),
				Arrays.asList(2),
				Arrays.asList(3),
				Arrays.asList(1,2),
				Arrays.asList(1,3),
				Arrays.asList(2,3),
				Arrays.asList(1,2,3),
				Arrays.asList()
		);

		assertEquals(actual.size(), expected.size());
		assertEquals(true, actual.containsAll(expected));
		assertEquals(true, expected.containsAll(actual));
	}

}