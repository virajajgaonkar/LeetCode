package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC039_Combination_Sum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> r = new ArrayList<>();
		backtrack(r, new ArrayList<>(), candidates, target, 0);
		return r;
	}

	private void backtrack(List<List<Integer>> r, List<Integer> t, int[] c, int remain, int start){
		if(remain < 0){
			return;
		} else if(remain == 0){
			r.add(new ArrayList<>(t));
		} else {
			for(int i=start; i < c.length; i++){
				t.add(c[i]);
				backtrack(r, t, c, remain - c[i], i );
				t.remove(t.size() -1);
			}
		}
	}
}
