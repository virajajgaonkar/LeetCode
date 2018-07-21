package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC198_House_RobberTest {
	LC198_House_Robber test = new LC198_House_Robber();
	@Test
	public void test(){
		assertEquals(204, test.rob(new int[]{1,2,1,2,100,1,2,1,2,100}));

//		assertEquals(4, test.rob(new int[]{1,2,3,1}));
//		assertEquals(12, test.rob(new int[]{2,7,9,3,1}));
//		assertEquals(4, test.rob(new int[]{2, 1, 1, 2}));

	}
}