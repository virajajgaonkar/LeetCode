package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LC017_Letter_Combinations_Of_A_Phone_Number {
	private static final Map<Character, List<Character>> MAPPING = new HashMap<Character, List<Character>>();
	static {
		MAPPING.put('1', Collections.<Character>emptyList());
		MAPPING.put('2', Arrays.asList('a', 'b', 'c'));
		MAPPING.put('3', Arrays.asList('d', 'e', 'f'));
		MAPPING.put('4', Arrays.asList('g', 'h', 'i'));
		MAPPING.put('5', Arrays.asList('j', 'k', 'l'));
		MAPPING.put('6', Arrays.asList('m', 'n', 'o'));
		MAPPING.put('7', Arrays.asList('p', 'q', 'r', 's'));
		MAPPING.put('8', Arrays.asList('t', 'u', 'v'));
		MAPPING.put('9', Arrays.asList('w', 'x', 'y', 'z'));
		MAPPING.put('0', Collections.<Character>emptyList());
	}


	private void letterCombinations(String prefix, char[] arr, int pos, List<String> lst){
		if(pos >= arr.length){
			lst.add(prefix);
			return;
		}
		for(Character c : MAPPING.get(arr[pos])){
			letterCombinations(prefix + c, arr, pos +1, lst);
		}
	}
	public List<String> letterCombinations(String digits) {
		if( (digits == null) || (digits.trim().length() ==0)){
			return Collections.emptyList();
		}
		List<String> result = new ArrayList<String>();
		letterCombinations("", digits.toCharArray(), 0, result);
		return result;
	}
}
