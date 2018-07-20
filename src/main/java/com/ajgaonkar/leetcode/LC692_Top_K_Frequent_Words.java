package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LC692_Top_K_Frequent_Words {
	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> freq = new HashMap<>();
		//O(n)
		for (String c : words){
			freq.put(c, freq.getOrDefault(c,0) +1);
		}
		//O(n)
		PriorityQueue<String>[] bucket = new PriorityQueue[words.length +1];
		for(String wrd : freq.keySet()){
			int count = freq.get(wrd);
			if(bucket[count] == null){
				bucket[count] = new PriorityQueue<>();
			}
			bucket[count].offer(wrd);
		}
		//O(n2)
		List<String> res = new ArrayList<>();
		for(int i=bucket.length-1; i>=0; i--){
			if(bucket[i] == null){
				continue;
			}
			while (bucket[i].size() >0){
				res.add(bucket[i].poll());
			}
			if(res.size() >= k){
				break;
			}
		}
		while (res.size() > k){
			res.remove(res.size() -1);
		}
		return res;
	}
}
