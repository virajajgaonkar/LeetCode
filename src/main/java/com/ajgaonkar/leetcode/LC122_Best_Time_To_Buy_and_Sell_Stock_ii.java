package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC122_Best_Time_To_Buy_and_Sell_Stock_ii {
	public int maxProfit(int[] prices) {
		int profit = 0;

		for(int i=0; i< (prices.length-1); ++i){
			int current = prices[i];
			int tomo = prices[i+1];
			if(tomo > current){
				profit = profit + (tomo -current);
			}
		}
		return profit;

	}
}
