package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC011_Container_With_Most_Water {
	public int maxArea(int[] height) {
		int i =0;
		int j = height.length -1;
		int max =0;
		while (i < j){
			if(height[i] <= height[j]){
				int newM = height[i] * (j -i);
				max = (newM > max) ? newM : max;
				i++;
			} else{
				int newM = height[j] * (j -i);
				max = (newM > max) ? newM : max;
				j--;
			}
		}
		return max;
	}
}
