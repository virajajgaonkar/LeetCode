package com.ajgaonkar.leetcode;

public class LC268_Missing_Number {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		int total = length * (length+1) /2;
		for(int i=0; i< length; i++){
			total = total -nums[i];
		}
		return total;
	}
}
