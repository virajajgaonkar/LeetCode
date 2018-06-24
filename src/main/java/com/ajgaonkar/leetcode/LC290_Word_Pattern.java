package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC290_Word_Pattern {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map index = new HashMap();
		for (Integer i=0; i<words.length; ++i) {
			if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
				return false;
			}
		}
		return true;
	}
}
