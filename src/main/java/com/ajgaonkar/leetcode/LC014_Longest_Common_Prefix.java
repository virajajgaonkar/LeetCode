package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC014_Longest_Common_Prefix {
	public String longestCommonPrefix(String st1, String st2) {
		if((st1 == null) || (st2 == null) || (st1.length() == 0) || (st2.length() == 0)){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		char[] s1 = st1.toCharArray();
		char[] s2 = st2.toCharArray();
		int maxLength = (s1.length < s2.length) ? s1.length : s2.length;

		for(int i =0; i< maxLength; i++){
			if(s1[i] == s2[i]){
				sb.append(s1[i]);
			} else {
				break;
			}
		}
		return sb.toString();
	}

	public String longestCommonPrefix(String[] strs) {
		if(strs.length ==1){
			return strs[0];
		}
		String result = null;
		for(int i=1; i<strs.length; i++){
			if(result == null){
				result = longestCommonPrefix(strs[i-1], strs[i]);
			} else {
				result = longestCommonPrefix(result, strs[i]);
			}

		}
		return (result == null) ? "": result;
	}
}
