package com.ajgaonkar.leetcode;

public class LC436_Island_Perimeter {
	public int islandPerimeter(int[][] grid) {
		if((grid == null) || (grid.length == 0)){
			return 0;
		}
		int count = 0;
		for(int i=0; i < grid.length; i++){
			for(int j=0; j < grid[0].length; j++){
				if(grid[i][j] == 0) {
					continue;
				}
				count = count + countSides(grid, i, j);
			}
		}
		return count;
	}

	private int countSides(int[][] grid, int i, int j){
		int top = (i ==0) ? 1: (grid[i-1][j] == 0) ? 1: 0;
		int bottom =  (i == grid.length-1) ? 1: (grid[i+1][j] == 0) ? 1: 0;
		int left =  (j ==0) ? 1: (grid[i][j-1] == 0) ? 1: 0;
		int right =  (j == grid[0].length-1) ? 1: (grid[i][j+1] == 0) ? 1: 0;
		return top + bottom + left + right;
	}
}
