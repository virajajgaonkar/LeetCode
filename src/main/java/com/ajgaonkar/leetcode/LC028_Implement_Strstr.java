package com.ajgaonkar.leetcode;

public class LC028_Implement_Strstr {
	public int strStr(String haystack, String needle) {
		if((needle == null) || (needle.length() == 0)){
			return 0;
		}
		if(needle.length() > haystack.length()){
			return -1;
		}
		for (int i =0; i < haystack.length() - needle.length()+1; i++){
			int hit = 0;
			for (int j =0; j < needle.length(); j++){
				if(haystack.charAt(i +j) != needle.charAt(j)){
					break;
				} else {
					hit ++;
					if(hit == needle.length()){
						return i;
					}
				}
			}
		}
		return -1;
	}
}
