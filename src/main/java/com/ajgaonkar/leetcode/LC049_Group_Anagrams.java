package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC049_Group_Anagrams {
	public List<List<String>> groupAnagramsVA(String[] strs) {
		if((strs== null) || (strs.length ==0)){
			return Collections.emptyList();
		}
		List<List<String>> result = new ArrayList<>();
		List<String> first = new ArrayList<>();
		first.add(strs[0]);
		result.add(first);

		for (int i =1; i < strs.length; i ++){
			String s1 = strs[i];
			boolean found = false;
			for(int j=0; j < result.size(); j++){
				String s2 = result.get(j).get(0);
				if(isAnagram(s1, s2)){
					result.get(j).add(s1);
					found = true;
					break;
				}
			}
			if(!found){
				List<String> lst = new ArrayList<>();
				lst.add(s1);
				result.add(lst);
			}
		}
		return result;
	}

	private boolean isAnagram(String s1, String s2){
		if((s1 == null) && (s2 == null)){
			return true;
		}
		if (s1 == null){
			return false;
		}
		if (s2 == null){
			return false;
		}
		if(s1.length() != s2.length()){
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 0);
			}
			map.put(c, map.get(c) +1);
		}

		for(int i=0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if(!map.containsKey(c)){
				return false;
			}
			int newCount = map.get(c) -1;
			if(newCount == 0){
				map.remove(c);
			} else {
				map.put(c, newCount);
			}
		}
		return map.isEmpty();
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String keyStr = String.valueOf(ca);
			if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
			map.get(keyStr).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}
}
