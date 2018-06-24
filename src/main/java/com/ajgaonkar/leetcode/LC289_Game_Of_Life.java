package com.ajgaonkar.leetcode;

public class LC289_Game_Of_Life {
	private int getCount(int[][] board, int i, int j){
		if((i <0 ) || (i >= board.length)){
			return 0;
		}
		if((j <0 ) || (j >= board[0].length)){
			return 0;
		}
		return board[i][j];
	}
	private int getNeighorsCount(int[][] board, int i, int j){
		return getCount(board, i-1, j-1) +
				getCount(board, i-1, j) +
				getCount(board, i-1, j+1) +
				getCount(board, i, j-1) +
				getCount(board, i, j+1) +
				getCount(board, i+1, j-1) +
				getCount(board, i+1, j) +
				getCount(board, i+1, j+1) ;
	}
	private void visit(int[][] board, int[][] r, int i, int j, boolean[][] visited){
		if((i <0 ) || (i >= board.length)){
			return;
		}
		if((j <0 ) || (j >= board[0].length)){
			return;
		}
		if(visited[i][j] == true){
			return;
		}
		visited[i][j] = true;
		int neighborsCount = getNeighorsCount(board, i, j);
		if(neighborsCount < 2){
			r[i][j] = 0;
		} else if (neighborsCount ==2){
			r[i][j] = board[i][j];
		} else if (neighborsCount ==3){
			r[i][j] = 1;
		} else if (neighborsCount >3){
			r[i][j] = 0;
		}
	}
	public void gameOfLife(int[][] board) {
		int[][] result = new int[board.length][board[0].length];
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i =0; i< board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				visit(board, result, i, j, visited);
			}
		}
		for(int i =0; i< board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				board[i][j] = result[i][j];
			}
		}
	}
}
