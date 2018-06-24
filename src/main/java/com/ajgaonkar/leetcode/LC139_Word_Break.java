package com.ajgaonkar.leetcode;

import java.util.List;

public class LC139_Word_Break {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() + 1];
		f[0] = true;
		//Second DP
		for(int i=1; i <= s.length(); i++){
			for(int j=0; j < i; j++){
				String subString = s.substring(j, i);
				System.out.println(j + " " + i + " " + subString + " " + f[j] + " " + wordDict.contains(s.substring(j, i)));
				if(f[j] && wordDict.contains(s.substring(j, i))){
					f[i] = true;
					break;
				}
			}
		}
		return f[s.length()];
	}
}
