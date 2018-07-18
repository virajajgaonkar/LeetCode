package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC347_Top_K_Frequent_Elements_2Test {
	LC347_Top_K_Frequent_Elements_2 test = new LC347_Top_K_Frequent_Elements_2();

	@Test
	public void test(){
		int[] input = new int[]{1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};
		List<Integer> actual = test.topKFrequent(input, 2);
		List<Integer> expected = Arrays.asList(5,4);
		assertEquals(actual, expected);
	}

}