package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC055_Jump_GameTest {
	LC055_Jump_Game test = new LC055_Jump_Game();

	@Test
	public void test(){
		assertEquals(true, test.canJump(new int[]{2,3,1,1,4}));
		assertEquals(false, test.canJump(new int[]{3,2,1,0,4}));
		assertEquals(true, test.canJump(new int[]{2,3,1,1,0}));
	}
}