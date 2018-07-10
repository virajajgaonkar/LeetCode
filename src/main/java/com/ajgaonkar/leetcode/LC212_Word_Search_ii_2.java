package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC212_Word_Search_ii_2 {
	public static class TrieNode{
		private final char c;
		private  boolean ends = false;
		private TrieNode[] children = new TrieNode[26];

		public TrieNode(char c) {
			this.c = c;
		}
	}
	public static class Trie{
		private final TrieNode root = new TrieNode(' ');

		private void add(String input, int index, TrieNode current){
			char c = input.charAt(index);
			int offset = 'z' - c;
			if(current.children[offset] == null){
				current.children[offset] = new TrieNode(c);
			}
			if(index == (input.length() -1)){
				current.children[offset].ends = true;
			} else {
				add(input, index +1, current.children[offset]);
			}
		}

		public void add(String input){
			if((input == null) || (input.length() ==0)){
				return;
			}
			add(input, 0, root);
		}

		public boolean startsWith(String input, int index, TrieNode current){
			char c = input.charAt(index);
			int offset = 'z' - c;
			if(current.children[offset] == null){
				return false;
			}
			if(index == (input.length() -1)){
				return true;
			} else {
				return startsWith(input, index+1, current.children[offset]);
			}
		}
		public boolean startsWith(String input){
			if((input == null) || (input.length() ==0)){
				return false;
			}
			return startsWith(input, 0, root);
		}

		public boolean contains(String input, int index, TrieNode current){
			char c = input.charAt(index);
			int offset = 'z' - c;
			if(current.children[offset] == null){
				return false;
			}
			if(index == (input.length() -1)){
				return current.children[offset].ends;
			} else {
				return contains(input, index+1, current.children[offset]);
			}
		}
		public boolean contains(String input){
			if((input == null) || (input.length() ==0)){
				return false;
			}
			return contains(input, 0, root);
		}

	}
	public List<String> findWords(char[][] board, String[] words) {
		Trie trie = new Trie();
		for(int i=0; i < words.length; i++){
			trie.add(words[i]);
		}
		Set<String> result = new HashSet<>();
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i=0; i< board.length; i++){
			for (int j=0; j < board[0].length; j++){
				visit(board, i, j, visited,"", trie, result);
			}
		}
		return new ArrayList<>(result);
	}

	private void visit(char[][] board, int i, int j, boolean[][] visited, String str, Trie trie, Set<String> result){
		if((i <0) || (i > board.length-1)){
			return;
		}
		if((j <0) || (j > board[0].length-1)){
			return;
		}
		if(visited[i][j]){
			return;
		}
		String a = str + board[i][j];
		if(!trie.startsWith(a)){
			return;
		}
		if(trie.contains(a)){
			result.add(a);
		}
		visited[i][j] = true;
		visit(board, i-1, j, visited, a, trie, result);
		visit(board, i+1, j, visited, a, trie, result);
		visit(board, i, j-1, visited, a, trie, result);
		visit(board, i, j+1, visited, a, trie, result);
		visited[i][j] = false;
		return;
	}
}
