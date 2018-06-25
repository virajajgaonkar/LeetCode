package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC406_Queue_Reconstruction_By_HeightTest {
	LC406_Queue_Reconstruction_By_Height test = new LC406_Queue_Reconstruction_By_Height();
	@Test
	public void test(){
		int[][] input = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		int[][] expected = new int[][]{{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
		int[][] actual = test.reconstructQueue(input);
		assertEquals(expected, actual);
	}
}