package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC035_Search_Insert_Position {
	//This is O(n)
	//Use Binary search for O(log n)
	public int searchInsert(int[] nums, int target) {
		if(nums == null){
			return 0;
		}

		for (int i = 0; i < nums.length; ++i){
			if(target == nums[i]){
				return i;
			} else if (target < nums[i]) {
				return i;
			}
		}
		return nums.length;
	}
}
