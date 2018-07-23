package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC295_Find_Median_From_Data_StreamTest {
	LC295_Find_Median_From_Data_Stream test = new LC295_Find_Median_From_Data_Stream();

	@Test
	public void test(){
		test.addNum(2);
		test.addNum(3);
		assertEquals(2.5, test.findMedian(), 0.0);
		test.addNum(4);
		assertEquals(3, test.findMedian(), 0.0);
		test.addNum(5);
		test.addNum(6);
		test.addNum(7);
		test.addNum(8);
		assertEquals(5, test.findMedian(), 0.0);
		test.addNum(9);
		assertEquals(5.5, test.findMedian(), 0.0);
	}
}