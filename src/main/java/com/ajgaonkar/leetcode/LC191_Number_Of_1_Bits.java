package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC191_Number_Of_1_Bits {
	public int hammingWeight(int n) {
		int mask = 1;
		int weight = 0;
		for(int i =0; i< 32; ++i){
			if((n & (mask << i)) != 0){
				weight++;
			}
		}
		return weight;
	}
}
