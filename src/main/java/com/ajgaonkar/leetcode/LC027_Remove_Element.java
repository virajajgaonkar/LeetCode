package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC027_Remove_Element {
	public int removeElement(int[] nums, int val) {
		if(nums == null){
			return 0;
		}
		int correct = 0;
		for(int i=0; i< nums.length; ++i){
			if(nums[i] != val){
				nums[correct] = nums[i];
				correct++;
			}
		}
		return correct;
	}
}
