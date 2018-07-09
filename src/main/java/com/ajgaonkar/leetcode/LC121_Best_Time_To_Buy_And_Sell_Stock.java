package com.ajgaonkar.leetcode;

public class LC121_Best_Time_To_Buy_And_Sell_Stock {
	public int maxProfit(int[] prices) {
		int maxS = Integer.MIN_VALUE;
		int maxProfit = 0;
		for(int i =(prices.length-2); i>=0; i--){
			maxS = Math.max(maxS, prices[i +1]);
			int profit = maxS -prices[i] ;
			maxProfit = Math.max(profit, maxProfit);
		}
		return (maxProfit <1) ? 0: maxProfit;
	}
}
