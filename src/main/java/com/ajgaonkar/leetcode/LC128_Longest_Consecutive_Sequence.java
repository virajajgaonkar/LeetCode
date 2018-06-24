package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC128_Longest_Consecutive_Sequence {
	public int longestConsecutive(int[] nums) {
		int res = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int n : nums) {
			if (m.containsKey(n)) {
				continue;
			}
			int left = (m.containsKey(n - 1)) ? m.get(n - 1) : 0;
			int right = (m.containsKey(n + 1)) ? m.get(n + 1) : 0;
			int sum = left + right + 1;
			res = Math.max(sum, res);
			m.put(n, sum);
			m.put(n, sum);
			m.put(n - left, sum);
			m.put(n + right, sum);
		}
		return res;
	}
}
