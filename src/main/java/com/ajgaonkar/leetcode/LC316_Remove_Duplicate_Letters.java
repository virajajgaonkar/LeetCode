package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LC316_Remove_Duplicate_Letters  {
	public static final class Data implements Comparable<Data>{
		private final Character c;
		private int count;

		public Data(Character c) {
			this.c = c;
			this.count = 1;
		}
		public void incrementCount(){
			this.count +=1;
		}

		public int compareTo(Data o) {
			//return this.count - o.count;
			return this.c - o.c;
		}
	}
	public String removeDuplicateLettersWrong(String s) {
		Map<Character, Data> map = new HashMap<Character, Data>();
		List<Data> lst = new ArrayList<Data>();

		for(int i =0; i< s.length(); i++){
			Character c = s.charAt(i);
			if(!map.containsKey(c)){
				Data d = new Data(c);
				map.put(c, d);
				lst.add(d);
			} else {
				map.get(c).incrementCount();
			}
		}
		Collections.sort(lst);
		StringBuilder sb = new StringBuilder();
		for (Data d : lst){
			sb.append(d.c);
		}
		return sb.toString();
	}

	public String removeDuplicateLetters(String str) {
		int[] res = new int[26]; //will contain number of occurences of character (i+'a')
		boolean[] visited = new boolean[26]; //will contain if character (i+'a') is present in current result Stack
		char[] ch = str.toCharArray();
		for(char c: ch){  //count number of occurences of character
			res[c-'a']++;
		}
		Stack<Character> st = new Stack<>(); // answer stack
		int index;
		for(char s:ch){
			index= s-'a';
			res[index]--;   //decrement number of characters remaining in the string to be analysed
			if(visited[index]) //if character is already present in stack, dont bother
				continue;
			//if current character is smaller than last character in stack which occurs later in the string again
			//it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
			while(!st.isEmpty() && s<st.peek() && res[st.peek()-'a']!=0){
				visited[st.pop()-'a']=false;
			}
			st.push(s); //add current character and mark it as visited
			visited[index]=true;
		}

		StringBuilder sb = new StringBuilder();
		//pop character from stack and build answer string from back
		while(!st.isEmpty()){
			sb.insert(0,st.pop());
		}
		return sb.toString();
	}
}
