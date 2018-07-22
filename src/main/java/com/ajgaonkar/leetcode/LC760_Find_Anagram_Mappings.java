package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC760_Find_Anagram_Mappings {
	public int[] anagramMappings(int[] A, int[] B) {
		int[] res = new int[A.length];
		Map<Integer, Stack<Integer>> map = new HashMap<>();
		for(int i=0; i< B.length; i++){
			int val = B[i];
			if(!map.containsKey(val)){
				map.put(val, new Stack<>());
			}
			map.get(val).push(i);
		}

		for(int i=0; i< A.length; i++){
			int val = A[i];
			res[i] = map.get(val).pop();
		}

		return res;
	}
}
