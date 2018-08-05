package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC085_Maximal_RectangleTest {
	LC085_Maximal_Rectangle test = new LC085_Maximal_Rectangle();

	@Test
	public void test(){
		char[][] arr = new char[][]{{'1','0','1','0','0'}, {'1','0','1','1','1'}, {'1','1','1','1','1'}, {'1','0','0','1','0'}};
		assertEquals(6, test.maximalRectangle(arr));
	}

}