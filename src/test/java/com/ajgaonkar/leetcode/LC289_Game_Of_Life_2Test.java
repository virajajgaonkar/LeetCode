package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC289_Game_Of_Life_2Test {
	LC289_Game_Of_Life_2 test = new LC289_Game_Of_Life_2();
	@Test
	public void test(){
		int[][] input = new int[][]{ {0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}};
		int[][] expected = new int[][]{ {0,0,0}, {1,0,1}, {0,1,1}, {0,1,0}};
		test.gameOfLife(input);
		assertEquals(input, expected);
	}

}