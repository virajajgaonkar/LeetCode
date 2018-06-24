package com.ajgaonkar.leetcode;

public class LC200_Number_Of_Islands {
	private void visit(char[][] grid, int i, int j){
		if((i < 0) || (i >= grid.length)){
			return;
		}
		if((j < 0) || (j >= grid[0].length)){
			return;
		}
		if(grid[i][j] == '0'){
			return;
		}
		grid[i][j] = '0';
		visit(grid, i-1, j);
		visit(grid, i+1, j);
		visit(grid, i, j -1);
		visit(grid, i, j +1);
	}
	public int numIslands(char[][] grid) {
		int res = 0;
		for(int i=0; i< grid.length; i++){
			for(int j =0; j < grid[0].length; j++){
				if(grid[i][j] == '1'){
					res +=1;
					visit(grid, i, j);
				}
			}
		}
		return res;
	}
}
