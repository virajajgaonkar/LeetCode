package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC212_Word_Search_ii {
	private boolean exist(char[][] board, String word) {
		if((word == null) || (word.length() == 0)){
			return false;
		}
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
	public List<String> findWords(char[][] board, String[] words) {
		List<String> res = new ArrayList<>();
		Set<String> w = new HashSet<>();

		for(int i=0; i< words.length; i++){
			if(w.contains(words[i])){
				continue;
			}
			w.add(words[i]);
			if(exist(board, words[i])){
				res.add(words[i]);
			}
		}
		return res;
	}
}
