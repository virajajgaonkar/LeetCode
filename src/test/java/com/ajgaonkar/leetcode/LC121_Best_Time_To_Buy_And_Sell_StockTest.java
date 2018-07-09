package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC121_Best_Time_To_Buy_And_Sell_StockTest {
	LC121_Best_Time_To_Buy_And_Sell_Stock test = new LC121_Best_Time_To_Buy_And_Sell_Stock();
	@Test
	public void test(){
		assertEquals(5, test.maxProfit(new int[]{7,1,5,3,6,4}));
		assertEquals(0, test.maxProfit(new int[]{7,6,4,3,1}));
	}
}