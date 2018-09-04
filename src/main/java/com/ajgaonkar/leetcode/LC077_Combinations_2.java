package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC077_Combinations_2 {
	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = new ArrayList<>();
		int[] ip = new int[n];
		for(int i=1; i <=n; i++){
			ip[i-1] = i;
		}
		backtrack(res, new ArrayList<>(), ip, k, 0);
		return res;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> t, int[] ip, int k, int start){
		if(t.size() == k){
			res.add(new ArrayList<>(t));
			return;
		}
		for(int i=start; i< ip.length; i++){
			t.add(ip[i]);
			backtrack(res, t, ip, k, i +1);
			t.remove(t.size() -1);
		}
	}
}
