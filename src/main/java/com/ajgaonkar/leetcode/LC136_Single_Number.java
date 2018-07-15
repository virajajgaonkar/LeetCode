package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC136_Single_Number {
	public int singleNumber(int[] nums) {
		int uniq = nums[0];
		for(int i=1; i< nums.length; ++i){
			uniq = uniq ^ nums[i];
		}
		return uniq;
	}
}
