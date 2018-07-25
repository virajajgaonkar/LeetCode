package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ToDo: LEARN
public class LC076_Subsets {
	private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] num, int start){
		res.add(new ArrayList<>(temp));
		for(int i=start; i< num.length; i++){
			temp.add(num[i]);
			backtrack(res, temp, num, i+1);
			temp.remove(temp.size()-1);
		}
	}
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(res,new ArrayList<>(), nums, 0);
		return res;
	}
}
