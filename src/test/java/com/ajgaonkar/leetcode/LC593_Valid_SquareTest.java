package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC593_Valid_SquareTest {
	LC593_Valid_Square test = new LC593_Valid_Square();

	@Test
	public void test(){
		assertEquals(true, test.validSquare(new int[]{0,0}, new int[]{0,1}, new int[]{1,0}, new int[]{1,1} ));
		assertEquals(true, test.validSquare(new int[]{0,0}, new int[]{0,2}, new int[]{2,0}, new int[]{2,2} ));
		assertEquals(true, test.validSquare(new int[]{1134,-2539}, new int[]{492,-1255}, new int[]{-792,-1897}, new int[]{-150,-3181} ));
	}
}