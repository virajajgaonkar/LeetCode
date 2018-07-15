package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

//ToDo: Redo
public class LC076_Minimum_Window_Substring {
	public String minWindow(String s, String t) {
		if((s== null) || (s.length() ==0)){
			return "";
		}
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i< t.length(); ++i){
			Character c = t.charAt(i);
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		int counter = map.size();
		int begin= 0;
		int end = 0;
		int head = 0;
		int length = Integer.MAX_VALUE;
		while (end < s.length() ){
			Character c = s.charAt(end);
			if(map.containsKey(c)){
				map.put(c, map.get(c)-1);
				if(map.get(c) == 0){
					counter--;
				}
			}
			end++;
			while (counter == 0){
				Character c1 = s.charAt(begin);
				if(map.containsKey(c1)){
					map.put(c1, map.get(c1)+1);
					if(map.get(c1) > 0) {
						counter++;
					}
				}
				if((end - begin) < length){
					length = end - begin;
					head = begin;
				}
				begin++;
			}
		}
		if(length == Integer.MAX_VALUE){
			return "";
		}
		return s.substring(head, head + length);
	}
}
