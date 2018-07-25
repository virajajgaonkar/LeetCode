package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC090_Subsets_ii {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, new ArrayList<>(), nums, 0);
		return res;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> tempResult, int[] nums, int start){
		res.add(new ArrayList<>(tempResult));
		for(int i=start; i < nums.length; i++){
			if((i >start) && (nums[i] == nums[i-1])){
				continue;
			}
			tempResult.add(nums[i]);
			backtrack(res, tempResult, nums, i +1);
			tempResult.remove(tempResult.size() -1);
		}
	}





}
