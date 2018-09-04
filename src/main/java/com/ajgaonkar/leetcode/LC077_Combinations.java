package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;
/*
Combinations - Use start in backtrack, When t size == k save t to r. Next start is i+1
Subsets - Use start in backtrack. Always save t to r.  Next start is i+1
Subsets ii Unique - Use start in backtrack. Always save t to r.  Next start is i+1. If ((i>start) && (n[i] == n[i-1])) continue
Permutations - No start in backtrack. When t szie == n.length save t to r.
Permutations ii Unique - No start in backtrack. When t szie == n.length save t to r. Use boolean[] used to continue. If used[i] or((i>0) && (n[i] == n[i-1]) && (!used[i-1])) continue
Combination Sum - Use start in backtrack, When remain == 0 save t to r. Next start is i
Combination Sum ii - Use start in backtrack, When remain == 0 save t to r. Next start is i +1. If ((i>start) && (n[i] == n[i-1])) continue
 */

public class LC077_Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> r = new ArrayList<>();
		int[] input = new int[n];
		for(int i=1; i <=n; i++){
			input[i-1] = i;
		}
		backtrack(r, new ArrayList<>(), input, k, 0);
		return r;
	}

	private void backtrack(List<List<Integer>> r, List<Integer> t, int[] n, int k, int start){
		if(t.size() == k){
			r.add(new ArrayList<>(t));
		}
		for(int i=start; i < n.length; i++){
			t.add(n[i]);
			backtrack(r, t, n, k, i+1);
			t.remove(t.size()-1);
		}
	}
}
