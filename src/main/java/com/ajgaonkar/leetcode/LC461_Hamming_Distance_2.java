package com.ajgaonkar.leetcode;

public class LC461_Hamming_Distance_2 {
	public int hammingDistance(int x, int y) {
		int dist = 0;
		for(int i =0; i <32; i++){
			if((((x >> i) & 1) ^ ((y >> i) & 1)) ==1){
				dist++;
			}
		}
		return dist;
	}
}
