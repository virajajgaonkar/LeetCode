package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC013_Roman_To_Integer {
	private static final Map<Character, Integer> MAP = new HashMap<>();
	static {
		MAP.put('I', 1);
		MAP.put('V', 5);
		MAP.put('X', 10);
		MAP.put('L', 50);
		MAP.put('C', 100);
		MAP.put('D', 500);
		MAP.put('M', 1000);
	}

	public int romanToInt(String s) {
		char[] c = s.toCharArray();
		int result = 0;
		int prevVal = 0;
		for(int i= c.length-1; i>=0; i--){
			char currentChar = c[i];
			int currentVal = MAP.get(currentChar);
			if(currentVal < prevVal){
				result = result - currentVal;
			} else {
				prevVal = currentVal;
				result = result + currentVal;
			}
		}
		return result;
	}
}
