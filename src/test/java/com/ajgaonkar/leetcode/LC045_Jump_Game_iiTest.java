package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC045_Jump_Game_iiTest {
	LC045_Jump_Game_ii_2 test = new LC045_Jump_Game_ii_2();

	@Test
	public void test(){
		assertEquals(2, test.jump(new int[]{2,3,1,1,4}));
	}


}