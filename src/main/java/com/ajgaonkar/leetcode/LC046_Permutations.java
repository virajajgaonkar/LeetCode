package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//ToDo: Delete
public class LC046_Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> r = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(r, new ArrayList<>(), nums);
		return r;

	}
	private void backtrack(List<List<Integer>> r, List<Integer> t, int[] nums){
		if(t.size() == nums.length){
			r.add(new ArrayList<>(t));
		} else {
			for(int i =0; i < nums.length; i++) {
				if (t.contains(nums[i])){
					continue;
				}
				t.add(nums[i]);
				backtrack(r, t, nums);
				t.remove(t.size()-1);
			}
		}
	}

}
