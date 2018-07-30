package com.ajgaonkar.leetcode;

public class LC205_Isomorphic_Strings {
	public boolean isIsomorphic(String s, String t) {
		if((s == null) && (t == null)){
			return true;
		} else if ((s == null) || (t == null)){
			return false;
		}
		if (s.length() != t.length()){
			return false;
		}
		int[]a = new int[256];
		int[]b = new int[256];
		for(int i=0; i< s.length(); i++){
			if(a[s.charAt(i)] != b[t.charAt(i)]){
				return false;
			}
			a[s.charAt(i)] = i + 1; //0 is int default value, so we use i+1 to distinguish between default vs index 0
			b[t.charAt(i)] = i + 1;
		}
		return true;
	}
}
