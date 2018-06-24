package com.ajgaonkar.leetcode;

import java.util.List;

public class LC139_Word_Break_2 {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() +1];
		f[0] = true;
		for(int i =1; i<= s.length(); i++){
			for (int j = 0; j < i; j++){
				String current = s.substring(j, i);
				System.out.println(j + " " + i + " " + current);
				if(f[j] && wordDict.contains(current)){
					f[i] = true;
					break;
				}
			}
		}
		return f[s.length()];
	}
}
