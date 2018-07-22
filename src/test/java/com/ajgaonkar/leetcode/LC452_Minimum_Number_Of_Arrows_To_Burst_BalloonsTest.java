package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC452_Minimum_Number_Of_Arrows_To_Burst_BalloonsTest {
	LC452_Minimum_Number_Of_Arrows_To_Burst_Balloons test = new LC452_Minimum_Number_Of_Arrows_To_Burst_Balloons();

	@Test
	public void test(){
		assertEquals(2, test.findMinArrowShots(
				new int[][] {
						new int[]{10, 16},
						new int[]{2, 8},
						new int[]{1, 6},
						new int[]{7, 12}
				}
		));

		assertEquals(4, test.findMinArrowShots(
				new int[][] {
						new int[]{1, 2},
						new int[]{3, 4},
						new int[]{5, 6},
						new int[]{7, 8}
				}
		));
	}

}