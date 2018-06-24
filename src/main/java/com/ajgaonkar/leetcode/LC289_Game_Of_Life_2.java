package com.ajgaonkar.leetcode;

public class LC289_Game_Of_Life_2 {
	private int getCount(int[][] board, int i, int j){
		if((i <0 ) || (i >= board.length)){
			return 0;
		}
		if((j <0 ) || (j >= board[0].length)){
			return 0;
		}
		return board[i][j] & 1;
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
	private void visit(int[][] board, int i, int j, boolean[][] visited){
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
		if (((neighborsCount ==2) || (neighborsCount ==3)) && (board[i][j] ==1)){
			board[i][j] = 3;
		} else if (neighborsCount ==3){
			board[i][j] = 2;
		}
	}
	public void gameOfLife(int[][] board) {
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i =0; i< board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				visit(board, i, j, visited);
			}
		}
		for(int i =0; i< board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				board[i][j] = board[i][j] >> 1;
			}
		}
	}
}
