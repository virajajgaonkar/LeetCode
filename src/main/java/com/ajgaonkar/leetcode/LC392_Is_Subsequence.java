package com.ajgaonkar.leetcode;

public class LC392_Is_Subsequence {
	public boolean isSubsequence(String s, String t) {
		int sIndex = 0;
		int tIndex = 0;
		while (sIndex < s.length()){
			if(tIndex >= t.length()){
				return false;
			}
			if(s.charAt(sIndex) == t.charAt(tIndex)){
				sIndex++;
				tIndex++;
			} else {
				tIndex++;
			}
		}
		return true;
	}
}
