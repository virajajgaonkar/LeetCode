package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC228_Summary_RangesTest {
	@Test
	public void testSummaryRanges1(){
		int[] nums = new int[]{0,1,2,4,5,7};
		List<String> expected = Arrays.asList("0->2","4->5","7");
		LC228_Summary_Ranges test = new LC228_Summary_Ranges();
		assertEquals(expected, test.summaryRanges(nums));
	}

	@Test
	public void testSummaryRanges2(){
		int[] nums = new int[]{0,2,3,4,6,8,9};
		List<String> expected = Arrays.asList("0","2->4","6","8->9");
		LC228_Summary_Ranges test = new LC228_Summary_Ranges();
		assertEquals(expected, test.summaryRanges(nums));
	}
}