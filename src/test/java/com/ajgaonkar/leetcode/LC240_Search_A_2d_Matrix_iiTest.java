package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC240_Search_A_2d_Matrix_iiTest {
	LC240_Search_A_2d_Matrix_ii test = new LC240_Search_A_2d_Matrix_ii();
	int[][] data = new int[][]{{1, 4, 7, 11, 15},
			{2, 5, 8, 12, 19},
			{3, 6, 9, 16, 22},
			{10, 13, 14, 17, 24},
			{18, 21, 23, 26, 30}};

	@Test
	public void test(){
		assertEquals(true, test.searchMatrix(data, 5));
		assertEquals(false, test.searchMatrix(data, 20));
	}
}