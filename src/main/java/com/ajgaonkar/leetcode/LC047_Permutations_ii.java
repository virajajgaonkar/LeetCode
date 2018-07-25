package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC047_Permutations_ii {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> r = new ArrayList<>();
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		backtrack(r, new ArrayList<>(), nums, used);
		return r;
	}

	private void backtrack(List<List<Integer>> r, List<Integer> t, int[] n, boolean[] used){
		if(t.size() == n.length){
			r.add(new ArrayList<>(t));
		} else {
			for (int i=0; i < n.length; i++){
				if(((i>0) && (n[i] == n[i-1]) && (!used[i-1])) || (used[i] == true)){
					continue;
				}
				used[i] = true;
				t.add(n[i]);
				backtrack(r, t, n, used);
				t.remove(t.size() -1);
				used[i] = false;
			}
		}

	}

}
