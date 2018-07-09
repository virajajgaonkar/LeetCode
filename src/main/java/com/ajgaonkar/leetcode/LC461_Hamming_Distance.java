package com.ajgaonkar.leetcode;

public class LC461_Hamming_Distance {
	public int hammingDistance(int x, int y) {
		int result = 0;
		for(int i=0; i<32; i++){
			if(((x >> i) & 1) != ((y >> i) & 1)){
				result++;
			}
		}
		return result;
	}
}
