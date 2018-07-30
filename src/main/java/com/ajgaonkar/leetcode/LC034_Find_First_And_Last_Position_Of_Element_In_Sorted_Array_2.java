package com.ajgaonkar.leetcode;

public class LC034_Find_First_And_Last_Position_Of_Element_In_Sorted_Array_2 {
	public int searchRangeLower(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length-1;
		while (lo<= hi){
			int mid = (lo + hi)/2;
			if(target == nums[mid]){
				if(mid == 0){
					return mid;
				} else if (nums[mid-1] < target){
					return mid;
				} else {
					hi = mid -1;
				}
			} else if (target < nums[mid]){
				hi = mid -1;
			} else {
				lo = mid +1;
			}
		}
		return -1;
	}
	public int searchRangeHigher(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length-1;
		while (lo<= hi){
			int mid = (lo + hi)/2;
			if(target == nums[mid]){
				if(mid == nums.length-1){
					return mid;
				} else if (target < nums[mid+1]){
					return mid;
				} else {
					lo = mid +1;
				}
			} else if (target < nums[mid]){
				hi = mid -1;
			} else {
				lo = mid +1;
			}
		}
		return -1;
	}
	public int[] searchRange(int[] nums, int target) {
		int lowerIndex = searchRangeLower(nums, target);
		if(lowerIndex == -1){
			return new int[]{-1, -1};
		}
		if(lowerIndex == nums.length-1){
			return new int[]{lowerIndex, lowerIndex};
		}
		if(target < nums[lowerIndex +1]){
			return new int[]{lowerIndex, lowerIndex};
		}
		int higherIndex = searchRangeHigher(nums, target);
		return new int[]{lowerIndex, higherIndex};
	}
}
