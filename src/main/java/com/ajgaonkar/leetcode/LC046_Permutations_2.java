package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC046_Permutations_2 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, new ArrayList<>(), nums, nums.length);
		return res;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> t, int[] ip, int k){
		if(t.size() == k){
			res.add(new ArrayList<>(t));
			return;
		}
		for(int i =0; i < ip.length; i++){
			if(t.contains(ip[i])){
				continue;
			}
			t.add(ip[i]);
			backtrack(res, t, ip, k);
			t.remove(t.size() -1);
		}
	}
}
