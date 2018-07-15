package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC137_Single_Number_ii {
	public int singleNumber(int[] nums) {
		int ones = 0, twos = 0;
		for(int i = 0; i < nums.length; i++){
			ones = (ones ^ nums[i]) & ~twos;
			twos = (twos ^ nums[i]) & ~ones;
		}
		return ones;
	}
}
