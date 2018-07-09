package com.ajgaonkar.leetcode;

public class LC283_Move_Zeroes {
	public void moveZeroes(int[] nums) {
		int nonZeroIndex=0;
		for(int i=0; i< nums.length; i++){
			if(nums[i] == 0){
				continue;
			}
			if(i == nonZeroIndex){
				nonZeroIndex++;
				continue;
			}
			nums[nonZeroIndex] = nums[i];
			nonZeroIndex++;
		}
		for(int i = nonZeroIndex; i< nums.length; i++){
			nums[i] = 0;
		}
	}
}
