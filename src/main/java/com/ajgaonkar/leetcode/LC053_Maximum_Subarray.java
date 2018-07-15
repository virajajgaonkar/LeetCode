package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC053_Maximum_Subarray {
	public int maxSubArray(int[] nums) {
		if(nums.length ==1){
			return nums[0];
		}
		int largestSum = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		int runningSum = 0;
		int currentSum = 0;
		while(end <= nums.length-1){
			currentSum = currentSum + nums[end];
			if(currentSum > largestSum){
				largestSum = currentSum;
			}
			if(currentSum < 0){
				currentSum = 0;
			}
			// System.out.println(end + ", " + largestSum + ", " + currentSum);
			end++;
		}
		return largestSum;
	}
}
