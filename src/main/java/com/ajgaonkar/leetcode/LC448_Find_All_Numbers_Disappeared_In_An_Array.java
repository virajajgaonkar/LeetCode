package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC448_Find_All_Numbers_Disappeared_In_An_Array {
	private void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public List<Integer> findDisappearedNumbers(int[] nums) {
		if((nums == null) || (nums.length == 0)){
			return Collections.emptyList();
		}
		int i =0;
		while (i < nums.length){
			int val = nums[i];
			int expectedIndex = val -1;
			if((expectedIndex != i) && (nums[expectedIndex] != val)){
				swap(nums, i, expectedIndex);
			} else {
				i++;
			}
		}
		List<Integer> res = new ArrayList<>();
		for(int j=0; j < nums.length; j++){
			if(nums[j] != (j +1)){
				res.add(j +1);
			}
		}
		return res;
	}
}
