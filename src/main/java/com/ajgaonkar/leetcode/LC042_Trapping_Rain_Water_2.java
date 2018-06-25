package com.ajgaonkar.leetcode;

public class LC042_Trapping_Rain_Water_2 {
	public int trap(int[] height) {
		int left = 0;
		int right = height.length -1;
		int res = 0;
		int maxLeft = 0;
		int maxRight = 0;
		while (left < right){
			if(height[left] <= height[right]){
				if(maxLeft <= height[left]){
					maxLeft = height[left];
				} else {
					res += maxLeft - height[left];
				}
				left++;
			} else {
				if(maxRight <= height[right]){
					maxRight = height[right];
				} else {
					res += maxRight - height[right];
				}
				right--;
			}
		}
		return res;
	}
}
