package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.Set;

//ToDo: Do again
public class LC421_Maximum_xor_Of_Two_Numbers_In_An_Array {
	public int findMaximumXOR(int[] nums) {
		int max = 0, mask = 0;
		for(int i = 31; i >= 0; i--){
			mask = mask | (1 << i);
			Set<Integer> set = new HashSet<>();
			for(int num : nums){
				set.add(num & mask);
			}
			int tmp = max | (1 << i);
			for(int prefix : set){
				if(set.contains(tmp ^ prefix)) {
					max = tmp;
					break;
				}
			}
		}
		return max;
	}
}
