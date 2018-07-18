package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC692_Top_K_Frequent_Words {
	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> freq = new HashMap<>();
		for (String c : words){
			freq.put(c, freq.getOrDefault(c,0) +1);
		}
		List<String>[] bucket = new List[words.length +1];
		for(String wrd : freq.keySet()){
			int count = freq.get(wrd);
			if(bucket[count] == null){
				bucket[count] = new ArrayList<>();
			}
			bucket[count].add(wrd);
		}

		List<String> res = new ArrayList<>();
		for(int i=bucket.length-1; i>=0; i--){
			if(bucket[i] == null){
				continue;
			}
			res.addAll(bucket[i]);
			if(res.size() >= k){
				break;
			}
		}
		return res;
	}
}
