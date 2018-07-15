package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC127_Word_Ladder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordsList = new HashSet<>(wordList);
		Set<String> reachedWords = new HashSet<>();
		wordsList.remove(beginWord);
		reachedWords.add(beginWord);

		int level = 1;

		while (!reachedWords.isEmpty()){
			Set<String> reachedNext = new HashSet<>();
			for(String s: reachedWords){
				for(int i=0; i< beginWord.length(); i++){
					for(int j=0; j < ('z' - 'a'); j++){
						char[] arr = s.toCharArray();
						arr[i] = (char) ('a' + j);
						String newStr = new String(arr);
						if(wordsList.remove(newStr)){
							reachedNext.add(newStr);
							if(newStr.compareTo(endWord) == 0){
								return level +1;
							}
						}
					}
				}
			}
			reachedWords = reachedNext;
			level++;
//			System.out.println("level = " + level + " reachedNext = " + reachedNext);
		}
		return 0;
	}
}
