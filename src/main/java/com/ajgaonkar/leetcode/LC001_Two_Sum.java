package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC001_Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] results = new int[2];
		for(int i = 0; i< nums.length; i++){
			if(map.containsKey(target - nums[i])){
				results[0] = map.get(target - nums[i]);
				results[1] = i;
				return results;
			}
			map.put(nums[i] , i);
		}
		return results;
	}
}
