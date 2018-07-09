package com.ajgaonkar.leetcode;

public class LC238_Product_Of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for(int i=0; i< nums.length; i++){
			result[i] = 1;
		}
		int sum = 1;
		for(int i=1; i < nums.length; i++){
			sum = sum * nums[i -1];
			result[i] = result[i] * sum;
		}
		sum = 1;
		for(int i= nums.length -2; i>=0; i--){
			sum = sum * nums[i +1];
			result[i] = result[i] * sum;
		}
		return result;
	}
}
