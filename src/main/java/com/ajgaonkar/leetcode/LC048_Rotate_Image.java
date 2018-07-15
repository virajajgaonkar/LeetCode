package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC048_Rotate_Image {
	public void transpose(int[][] a, int length) {
		for(int i=0; i< length; i++){
			for(int j=i+1; j< length; j++){
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}
	public void mirror(int[][] a, int length) {
		for(int i=0; i< length; i++){
			for(int j=0; j< length/2; j++){
				int temp = a[i][j];
				a[i][j] = a[i][length -1 -j];
				a[i][length -1 -j] = temp;
			}
		}
	}
	public void rotate(int[][] matrix) {
		if(matrix == null){return;}
		int length = matrix[0].length;
		transpose(matrix, length);
		mirror(matrix, length);
	}
}
