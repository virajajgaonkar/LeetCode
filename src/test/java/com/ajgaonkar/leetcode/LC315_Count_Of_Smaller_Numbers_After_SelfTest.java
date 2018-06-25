package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC315_Count_Of_Smaller_Numbers_After_SelfTest {
	LC315_Count_Of_Smaller_Numbers_After_Self test = new LC315_Count_Of_Smaller_Numbers_After_Self();
	@Test
	public void test(){
		int[] input = new int[]{5,2,6,1};
		List<Integer> expected = Arrays.asList(new Integer[]{2,1,1,0});
		List<Integer> actual = test.countSmaller(input);
		assertEquals(expected, actual);
	}
}