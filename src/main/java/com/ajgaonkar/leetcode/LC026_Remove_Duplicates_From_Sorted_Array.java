package com.ajgaonkar.leetcode;

public class LC026_Remove_Duplicates_From_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		if((nums == null) || (nums.length <1)){
			return 0;
		}
		int len = nums.length;
		int nextUniqueIndex = 1;
		int prev = nums[0];

		for(int i=1; i< len; i++){
			int current = nums[i];
			if(current == prev){
				continue;
			}
			if(i != nextUniqueIndex){
				nums[nextUniqueIndex] = current;
			}
			nextUniqueIndex++;
			prev = current;
		}
		return nextUniqueIndex;
	}
}
