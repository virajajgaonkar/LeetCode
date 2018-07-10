package com.ajgaonkar.leetcode;

public class LC125_Valid_Palindrome {
	public boolean isPalindrome(String s) {
		int lo = 0;
		int hi = s.length() -1;

		while (lo < hi){
			if(!isAlphaNumeric(s.charAt(lo))){
				lo++;
				continue;
			}
			if(!isAlphaNumeric(s.charAt(hi))){
				hi--;
				continue;
			}
			char c1 = s.charAt(lo);
			char c2 = s.charAt(hi);
			if((c1 == c2) || (toLowerCase(c1) == toLowerCase(c2))){
				lo++;
				hi--;
				continue;
			}
			return false;
		}
		return true;
	}
	private char toLowerCase(char c){
		if ((c >='A') && (c <= 'Z')){
			return (char) (c + Math.abs('a' - 'A'));
		}
		return c;
	}
	private boolean isAlphaNumeric(char c){
		if ((c >='a') && (c <= 'z')){
			return true;
		}
		if ((c >='A') && (c <= 'Z')){
			return true;
		}
		if ((c >='0') && (c <= '9')){
			return true;
		}
		return false;
	}
}
