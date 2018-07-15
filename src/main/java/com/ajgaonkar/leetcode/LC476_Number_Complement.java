package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC476_Number_Complement {
	public int findComplement(int num) {
		int one = 1;
		int count = 0;
		int dummy = num;
		while (dummy != 0){
			dummy = (dummy >> 1);
			count++;
		}
		for(int i=0; i< count; ++i){
			int mask = (one << i);
			num = num ^ mask;
		}
		return num;
	}
}
