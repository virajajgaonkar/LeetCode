package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC085_Maximal_Rectangle {
	private int maximalRectangleInHistogram(int[] arr) {
		int area = 0;
		int maxArea = 0;
		Stack<Integer> s = new Stack<>();
		int i=0;
		while (i< arr.length){
			if((s.isEmpty()) ||(arr[i] >= arr[s.peek()])){
				s.push(i);
				i++;
			} else {
				int top = s.pop();
				if(s.isEmpty()){
					area = arr[top] * i;
				} else {
					area = arr[top] * (i - 1 - s.peek());
				}
				maxArea = Math.max(maxArea, area);
			}
		}
		while (!s.isEmpty()){
			int top = s.pop();
			if(s.isEmpty()){
				area = arr[top] * i;
			} else {
				area = arr[top] * (i - 1 - s.peek());
			}
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
	private void convertCharArrToIntArr(char[][] a, int[][] b){
		for(int i=0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j] == '1'){
					b[i][j] = 1;
				}
			}
		}
	}
	public int maximalRectangle(char[][] matrix) {
		int[][] arr = new int[matrix.length][matrix[0].length];
		convertCharArrToIntArr(matrix, arr);
		int[] hist = new int[matrix[0].length];
		for(int j =0; j < matrix[0].length; j++){
			hist[j] = arr[0][j];
		}
		int area = maximalRectangleInHistogram(hist);
		int maxArea = area;
		for(int i =1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (arr[i][j] == 0) {
					hist[j] = 0;
				} else {
					hist[j] = hist[j] + arr[i][j];
				}
			}
			area = maximalRectangleInHistogram(hist);
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
}
