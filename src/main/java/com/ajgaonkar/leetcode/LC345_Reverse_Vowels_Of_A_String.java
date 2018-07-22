package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC345_Reverse_Vowels_Of_A_String {
	private final static Set<Character> VOWELS = new HashSet<>();
	static {
		VOWELS.add('a');
		VOWELS.add('e');
		VOWELS.add('i');
		VOWELS.add('o');
		VOWELS.add('u');
		VOWELS.add('A');
		VOWELS.add('E');
		VOWELS.add('I');
		VOWELS.add('O');
		VOWELS.add('U');
	}
	public String reverseVowels(String s) {
		if(s == null){
			return null;
		}
		char[] res = s.toCharArray();
		int start = 0;
		int end = res.length -1;
		while (start < end){
			while ((start<end) && (!VOWELS.contains(res[start]))){
				start++;
			}
			while ((start<end) && (!VOWELS.contains(res[end]))){
				end--;
			}
			if(res[start] != res[end]){
				char temp = res[start];
				res[start] = res[end];
				res[end] = temp;
			}
			start++;
			end--;
		}
		return new String(res);
	}

}
