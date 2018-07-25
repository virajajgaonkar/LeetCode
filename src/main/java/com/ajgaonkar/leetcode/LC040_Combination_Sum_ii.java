package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC040_Combination_Sum_ii {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> r = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(r, new ArrayList<>(), candidates, target, 0);
		return r;
	}

	private void backtrack(List<List<Integer>> r, List<Integer> t, int[] c, int remain, int start){
		if(remain < 0){
			return;
		} else if(remain == 0){
			r.add(new ArrayList<>(t));
		} else {
			for(int i= start; i < c.length; i++){
				if((i>start) && (c[i] == c[i-1])){
					continue;
				}
				t.add(c[i]);
				backtrack(r, t, c, remain-c[i], i+1);
				t.remove(t.size() -1);
			}
		}
	}

}
