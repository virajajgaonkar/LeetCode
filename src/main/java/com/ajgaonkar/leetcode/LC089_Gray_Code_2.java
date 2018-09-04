package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC089_Gray_Code_2 {
	public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<>();
		res.add(0);

		for(int i=0; i<n; i++){
			int mask = (1 << i);
			for(int j=res.size()-1; j>=0; j-- ){
				res.add(res.get(j) | mask);
			}
		}
		return res;
	}
}
