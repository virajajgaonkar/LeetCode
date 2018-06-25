package com.ajgaonkar.leetcode;

public class LC240_Search_A_2d_Matrix_ii {
	public boolean searchMatrix(int[][] matrix, int target) {
		int r = 0;
		int c = matrix[0].length -1;
		while ((c >=0) && (r <= matrix.length -1)){
			if(matrix[r][c] == target){
				return true;
			} else if (target < matrix[r][c]){
				c--;
			} else if (target > matrix[r][c]){
				r++;
			} else {
				return false;
			}
		}
		return false;
	}
}
