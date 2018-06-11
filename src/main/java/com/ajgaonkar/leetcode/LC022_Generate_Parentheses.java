package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC022_Generate_Parentheses {
	private void backtrack(String prefix, int open, int close, int max, List<String> result) {
		if(prefix.length() == max *2){
			result.add(prefix);
			return;
		}
		if(open < max){
			backtrack(prefix + "(" , open +1, close, max, result);
		}
		if(close < open){
			backtrack(prefix + ")" , open , close +1, max, result);
		}
	}
	public List<String> generateParenthesis(int n) {
		List<String> results = new ArrayList<String>();
		backtrack("", 0, 0, n, results);
		return results;
	}
}
