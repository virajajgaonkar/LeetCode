package com.ajgaonkar.leetcode;

public class LC476_Number_Complement_2 {
	public int findComplement(int num) {
		boolean seen = false;
		int res = 0;
		for(int i =31; i >=0; i--){
			int lastBit = ((num >> i) & 1);
			if(lastBit == 1){
				seen = true;
			}
			if(seen){
				res = res | ((lastBit ^ 1) <<i);
			}
		}
		return res;
	}
}
