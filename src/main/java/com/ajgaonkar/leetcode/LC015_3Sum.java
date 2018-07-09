package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LC015_3Sum {
	public List<List<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		List<List<Integer>> result = new ArrayList<>();
		for (int i=0; i < num.length -2; i ++){
			if((i==0) || (num[i] != num[i -1])){
				int lo = i+1;
				int hi = num.length -1;
				int sum = 0 - num[i];
				while (lo < hi){
					if(num[lo] + num[hi] == sum){
						result.add(Arrays.asList(num[i], num[lo], num[hi]));
						while ((lo < hi) && (num[lo] == num[lo +1])){
							lo++;
						}
						while ((lo < hi) && (num[hi] == num[hi -1])){
							hi--;
						}
						lo++;
						hi--;
					} else if (num[lo] + num[hi] < sum){
						lo++;
					} else {
						hi--;
					}
				}
			}
		}
		return result;
	}
}
