package com.ajgaonkar.leetcode;

public class LC162_Find_Peak_Element {
	private boolean isGreaterThan(int[] nums, int i, int other){
		if((other <0) || (other >= nums.length)){
			return true;
		}
		return nums[i] > nums[other];
	}
	//O(n)
	public int findPeakElement2(int[] nums) {
		for(int i=0; i < nums.length; i ++){
			if((isGreaterThan(nums, i, i -1)) && (isGreaterThan(nums,i, i+1))){
				return i;
			}
		}
		return -1;
	}
	private boolean findPeakElement(int[] nums, int start, int end, int[] res) {
		while (start <= end){
			int mid = start + ((end -start)/2);
			if((isGreaterThan(nums, mid, mid -1)) && (isGreaterThan(nums,mid, mid+1))){
				res[0] = mid;
				return true;
			}
			return findPeakElement(nums, start, mid -1, res) || findPeakElement(nums, mid+1, end, res);
		}
		return false;
	}
	//O(Log(n))
	public int findPeakElement(int[] nums) {
		int start = 0;
		int end = nums.length -1;
		int[] res = new int[1];
		if(findPeakElement(nums, start, end, res)){
			return res[0];
		} else {
			return -1;
		}
	}
}
