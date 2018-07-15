package com.ajgaonkar.leetcode;

public class LC055_Jump_Game {
	public boolean canJump(int[] A) {
		int max = 0;
		for(int i=0;i<A.length;i++){
			if(i>max) {return false;}
			max = Math.max(A[i]+i,max);
		}
		return true;
	}
}
