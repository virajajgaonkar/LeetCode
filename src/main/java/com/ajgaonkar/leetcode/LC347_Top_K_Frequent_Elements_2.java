package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC347_Top_K_Frequent_Elements_2 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer>[] bucket = new List[nums.length +1];
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i=0; i< nums.length; i++){
			freq.put(nums[i], freq.getOrDefault(nums[i], 0) +1);
		}

		for (Integer num : freq.keySet()){
			int frequency = freq.get(num);
			if(bucket[frequency] == null){
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(num);
		}

		List<Integer> res = new ArrayList<>();
		for(int i= bucket.length-1; i >=0; i--){
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
