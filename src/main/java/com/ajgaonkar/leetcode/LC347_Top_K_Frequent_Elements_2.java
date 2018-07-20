package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC347_Top_K_Frequent_Elements_2 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer>[] bucket = new List[nums.length +1];
		Map<Integer, Integer> freq = new HashMap<>();
		//O(n)
		for(int i=0; i< nums.length; i++){
			freq.put(nums[i], freq.getOrDefault(nums[i], 0) +1);
		}

		//O(n)
		for (Integer num : freq.keySet()){
			int frequency = freq.get(num);
			if(bucket[frequency] == null){
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(num);
		}

		//O(n ^2)
		List<Integer> res = new ArrayList<>();
		//O(n ^2) -> O(n)
		for(int i= bucket.length-1; i >=0; i--){
			if(bucket[i] == null){
				continue;
			}
			//O(n ^2) -> O(n)
			res.addAll(bucket[i]);
			if(res.size() >= k){
				break;
			}
		}
		return res;
	}
}
