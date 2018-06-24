package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC316_Remove_Duplicate_Letters_3 {
	public String removeDuplicateLetters(String s) {
		int[]lastIndexOf = new int[26];
		int[]counts = new int[26];
		boolean[] visited = new boolean[26];
		char[] cArr = s.toCharArray();
		Stack<Character> st = new Stack<>();
		for(char c : cArr){
			counts[c - 'a'] = counts[c - 'a'] +1;
		}
		for(char c : cArr){
			int index = c - 'a';
			//Decrement index
			counts[index] = counts[index]- 1;
			if(visited[index] == true){
				continue;
			}
			while ((!st.empty()) && (c < st.peek()) && (counts[st.peek() - 'a'] > 0)){
				visited[st.pop() - 'a'] = false;
			}
			visited[index] = true;
			st.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (!st.empty()){
			sb.insert(0, st.pop());
		}
		return sb.toString();
	}
}
