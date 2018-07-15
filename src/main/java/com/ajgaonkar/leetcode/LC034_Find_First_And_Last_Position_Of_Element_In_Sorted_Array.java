package com.ajgaonkar.leetcode;

//ToDo: Redo
//ToDo: Optimize
public class LC034_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
	//This is O(n)
	//Use Binary search for O(log n)
	public int[] searchRange(int[] nums, int target) {
		int[] r = {-1, -1};
		if(nums == null){
			return r;
		}
		boolean found = false;
		for(int i=0; i< nums.length; ++i){
			if(nums[i] != target){
				continue;
			}
			if(!found){
				r[0] = i;
				r[1] = i;
				found = true;
			} else {
				r[1] = i;
			}
		}
		return r;
	}
}
