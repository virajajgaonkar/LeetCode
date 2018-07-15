package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ToDo: Redo
public class LC438_Find_All_Anagrams_In_A_String {
	public List<Integer> findAnagrams(String s, String p) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i =0; i< p.length(); ++i){
			Character c = p.charAt(i);
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		List<Integer> res = new ArrayList<>();
		int counter = map.size();
		int begin = 0;
		int end = 0;
		while (end < s.length()){
			Character c = s.charAt(end);
			if(map.containsKey(c)){
				map.put(c, map.get(c) -1);
				if(map.get(c) ==0){
					counter--;
				}
			}
			end++;
			while (counter ==0){
				Character cTemp = s.charAt(begin);
				if(map.containsKey(cTemp)){
					map.put(cTemp, map.get(cTemp) +1);
					if(map.get(cTemp) >0){
						counter++;
					}
				}
				if((end - begin) == p.length()){
					res.add(begin);
				}
				begin++;
			}
		}
		return res;
	}
}
