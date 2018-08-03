package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC244_Shortest_Word_Distance_ii {
	private final Map<String, List<Integer>> map = new HashMap<>();
	public LC244_Shortest_Word_Distance_ii(String[] words) {
		for(int i=0; i< words.length; i++){
			if(!map.containsKey(words[i])){
				map.put(words[i], new ArrayList<>());
			}
			map.get(words[i]).add(i);
		}
	}

	public int shortest(String word1, String word2) {
		List<Integer> index1 = map.get(word1);
		List<Integer> index2 = map.get(word2);
		int distance = Integer.MAX_VALUE;
		for(Integer i : index1){
			for (Integer j : index2){
				distance = Math.min(distance, Math.abs(i -j));
			}
		}
		return distance;
	}
}
