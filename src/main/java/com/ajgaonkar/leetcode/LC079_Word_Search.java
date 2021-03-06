package com.ajgaonkar.leetcode;

public class LC079_Word_Search {
	public boolean exist(char[][] board, String word) {
		char[] c = word.toCharArray();
		for (int i =0; i< board.length; i++){
			for (int j=0; j < board[0].length; j++){
				if(c[0] == board[i][j]){
					if(exists(board, i, j, c, 0, new boolean[board.length][board[0].length])){
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean exists(char[][] board, int i, int j, char[] word, int index, boolean[][] visited){
		if((i <0) || (i > board.length -1)){
			return false;
		}
		if((j<0) || (j > board[0].length -1)){
			return false;
		}
		if(visited[i][j] == true){
			return false;
		}
		if(board[i][j] != word[index]){
			return false;
		}
		visited[i][j] = true;
		if(index == ( word.length-1)){
			return true;
		}
		boolean exists = exists(board, i-1, j, word, index +1, visited)
				|| exists(board, i+1, j, word, index +1, visited)
				|| exists(board, i, j -1, word, index +1, visited)
				|| exists(board, i, j +1, word, index +1, visited);
		if(!exists){
			visited[i][j] = false;
			return false;
		}
		return true;
	}
}
