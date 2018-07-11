package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

//ToDo: Redo
public class LC003_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int d = 0;
		int begin = 0;
		int end =0;
		int current = 0;
		while (end < s.length()){
			Character c = s.charAt(end);
			map.put(c, map.getOrDefault(c,0) +1);
			if(map.get(c) >1){
				current ++;
			}
			end++;
			while (current >0){
				Character cTemp = s.charAt(begin);
				map.put(cTemp, map.get(cTemp)-1);
				if(map.get(cTemp) == 1){
					current--;
				}
				begin++;
			}
			d = Math.max(d, (end - begin));
		}
		return d;
	}
}
