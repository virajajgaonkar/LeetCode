package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC436_Island_PerimeterTest {
	LC436_Island_Perimeter test = new LC436_Island_Perimeter();

	@Test
	public void test(){
		assertEquals(16, test.islandPerimeter(new int[][]
				{{0,1,0,0},
				{1,1,1,0},
				{0,1,0,0},
				{1,1,0,0}}));
	}
}