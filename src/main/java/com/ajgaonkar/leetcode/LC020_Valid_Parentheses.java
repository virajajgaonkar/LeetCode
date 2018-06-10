package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LC020_Valid_Parentheses {
	private static final Set<Character> OPENING = new HashSet<Character>();
	static {
		OPENING.add('(');
		OPENING.add('{');
		OPENING.add('[');
	}
	private static final Map<Character, Character> CLOSING = new HashMap<Character, Character>();
	static {
		CLOSING.put(')', '(');
		CLOSING.put('}', '{');
		CLOSING.put(']', '[');
	}

	public boolean isValid(String s) {
		if((s == null) || (s.length() ==0)){
			return false;
		}
		if(s.length() %2 != 0){
			return false;
		}

		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i< s.length(); i++){
			Character current = s.charAt(i);
			if(OPENING.contains(current)){
				stack.push(s.charAt(i));
				continue;
			}
			if(stack.empty()){
				return false;
			}
			Character prev = stack.pop();
			if(CLOSING.containsKey(current)){
				if(! prev.equals(CLOSING.get(current))){
					return false;
				}
			}
		}
		return true;
	}
}
