package com.ajgaonkar.leetcode;

public class LC041_First_Missing_Positive {
	private void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public int firstMissingPositive(int[] nums) {
		if((nums == null) || (nums.length ==0)){
			return 1;
		}
		int i=0;
		while (i < nums.length){
			int v = nums[i];
			if(v < 1){
				i++;
				continue;
			}
			int index = v -1;
			if((i != index) && (index < nums.length) && (nums[index] != v)){
				swap(nums, i, index);
			} else {
				i++;
			}
		}
		for(int j=0; j< nums.length; j++){
			int expected = j +1;
			if(nums[j] != expected){
				return expected;
			}
		}
		return nums.length +1;
	}
}
