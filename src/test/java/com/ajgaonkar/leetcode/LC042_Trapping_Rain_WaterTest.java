package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC042_Trapping_Rain_WaterTest {
	//LC042_Trapping_Rain_Water test = new LC042_Trapping_Rain_Water();
	LC042_Trapping_Rain_Water_2 test = new LC042_Trapping_Rain_Water_2();


	@Test
	public void test(){
		assertEquals(6, test.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
	}
}