package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC442_Find_All_Duplicates_In_An_Array {
	private void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public List<Integer> findDuplicates2(int[] nums) {
		int index = 0;
		while (index < nums.length){
			int val = nums[index];
			int expectedIndex = val -1;
			if((expectedIndex != index) && (nums[expectedIndex] != val)){
				swap(nums, index, expectedIndex);
			} else {
				index++;
			}
		}
		List<Integer> res = new ArrayList<>();
		for(int i =0; i < nums.length; i++){
			if(nums[i] != i+1){
				res.add(nums[i]);
			}
		}
		return res;
	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		//Looks at num[i] i.e. val
		//Set number at index (val -1) to negative
		//If the number at index (val -1) is already negative, it is a duplicate
		for (int i =0; i< nums.length; i++){
			int index = Math.abs(nums[i]) -1;
			if(nums[index] <0){
				res.add(Math.abs(nums[i]));
			}
			nums[index] = -nums[index];
		}
		return res;
	}
}
