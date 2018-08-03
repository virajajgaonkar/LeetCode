package com.ajgaonkar.leetcode;

public class LC243_Shortest_Word_Distance {
	public int shortestDistance(String[] words, String word1, String word2) {
		Integer index1 = null;
		Integer index2 = null;
		int distance = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				index1 = i;
			}
			if (words[i].equals(word2)) {
				index2 = i;
			}
			if ((index1 != null) && (index2 != null)) {
				distance = Math.min(distance, Math.abs(index1 - index2));
			}
		}
		return distance;
	}
}
