package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC200_Number_Of_IslandsTest {
	LC200_Number_Of_Islands test = new LC200_Number_Of_Islands();
	@Test
	public void test(){
		char[][] a = new char[][]{{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
		assertEquals(1, test.numIslands(a));

		char[][] b = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'},{'0','0','0','1','1'}};
		assertEquals(3, test.numIslands(b));
	}
}