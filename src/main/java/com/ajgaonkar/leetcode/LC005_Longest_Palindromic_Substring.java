package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC005_Longest_Palindromic_Substring {
	private boolean isPalindrome(char[] s, int start, int end){

		while(start < end){
			if(s[start] != s[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	private String charArrToString(char[] s, int start, int end){
		StringBuffer sb = new StringBuffer();
		for(int i=start; i<= end; i++){
			sb.append(s[i]);
		}
		return sb.toString();
	}
	public String longestPalindrome(char[] s) {
		for(int i=s.length; i>1; i--) {
			for(int j = 0; i + j <= s.length; j++) {
				int end = i+j-1;
				//System.out.println(i + " , " + j + " , " + end);
				if (isPalindrome(s, j, end)) {
					return charArrToString(s, j, end);
				}
			}
		}
		return charArrToString(s, 0, 0);
	}
	public String longestPalindrome(String s) {
		if(s == null){
			return null;
		}
		char[] t = s.toCharArray();
		return longestPalindrome(t);
	}
}
