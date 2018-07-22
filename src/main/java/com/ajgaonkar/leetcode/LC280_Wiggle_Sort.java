package com.ajgaonkar.leetcode;

public class LC280_Wiggle_Sort {
	public void wiggleSort(int[] nums) {
		if((nums == null) || (nums.length <=1)){
			return;
		}
		for(int i =0; i <nums.length-1; i ++){
			if((i % 2) == 0){
				if(nums[i] > nums[i +1]){
					swap(nums, i, i +1);
				}
			} else {
				if(nums[i] < nums[i +1]){
					swap(nums, i, i +1);
				}
			}
		}
	}

	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
