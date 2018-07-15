package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC338_Counting_Bits {
	public int[] countBits(int num) {
		int[] f = new int[num+1];
		for(int i =1; i <= num; ++i){
			f[i] = f[i>>1] + (i & 1);
		}
		return f;
	}
}
