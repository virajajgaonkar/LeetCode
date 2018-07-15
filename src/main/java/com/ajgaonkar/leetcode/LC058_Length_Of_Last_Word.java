package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC058_Length_Of_Last_Word {
	public int lengthOfLastWord(String s) {
		int lengthOfLastWord = 0;
		char[] arr = s.toCharArray();
		int index = arr.length -1;
		while(index >=0){
			if(arr[index] == ' '){
				if(lengthOfLastWord >0){
					return lengthOfLastWord;
				}
			} else {
				lengthOfLastWord++;
			}
			index--;
		}
		return lengthOfLastWord;
	}
}
