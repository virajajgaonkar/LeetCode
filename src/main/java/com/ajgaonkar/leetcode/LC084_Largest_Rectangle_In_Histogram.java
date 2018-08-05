package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC084_Largest_Rectangle_In_Histogram {
	public int largestRectangleArea(int[] heights) {
		int area = 0;
		int maxArea = 0;
		Stack<Integer> stack = new Stack<>();
		int i=0;
		while (i < heights.length){
			if((stack.isEmpty())||(heights[i]>=heights[stack.peek()])){
				stack.push(i);
				i++;
			} else {
				int index = stack.pop();
				if(stack.isEmpty()){
					area = heights[index] *i;
				} else {
					area = heights[index] * (i - stack.peek() -1);
				}
				maxArea = Math.max(maxArea, area);
			}
		}
		while (!stack.isEmpty()){
			int index = stack.pop();
			if(stack.isEmpty()){
				area = heights[index] *i;
			} else {
				area = heights[index] * (i - stack.peek() -1);
			}
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
}
