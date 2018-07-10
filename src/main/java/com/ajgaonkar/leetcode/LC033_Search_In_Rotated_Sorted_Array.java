package com.ajgaonkar.leetcode;

public class LC033_Search_In_Rotated_Sorted_Array {

	public int search(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length -1;
		while (lo < hi){
			int mid = (lo + hi) /2;
			if(nums[mid] > nums[hi]){
				lo = mid +1;
			} else {
				hi = mid;
			}
		}
		int rot = lo;
		lo = 0;
		hi = nums.length -1;
		while (lo <= hi){
			int mid = (lo + hi)/2;
			int realMid = (mid + rot)% nums.length;
			if(nums[realMid] == target){
				return realMid;
			} else if (nums[realMid] < target){
				lo = mid +1;
			} else {
				hi = mid -1;
			}
		}
		return -1;
	}
}
