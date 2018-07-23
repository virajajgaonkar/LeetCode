package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC480_Sliding_Window_MedianTest {
	//LC480_Sliding_Window_Median test = new LC480_Sliding_Window_Median();
	LC480_Sliding_Window_Median_2 test = new LC480_Sliding_Window_Median_2();

	@Test
	public void test(){
		assertArrayEquals(new double[]{1,-1,-1,3,5,6}, test.medianSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3), 0.0);
	}

}