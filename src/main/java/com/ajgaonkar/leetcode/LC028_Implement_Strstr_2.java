package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC028_Implement_Strstr_2 {
	private boolean isMatch(char[] array1, char[] array2, int start){
		for(int i=0; i<array2.length; ++i){
			if(array1[start +i] != array2[i]){
				return false;
			}
		}
		return true;
	}
	public int strStr(String haystack, String needle) {
		if(haystack == null){
			return -1;
		}
		if(needle == null){
			return -1;
		}
		char[] hArray = haystack.toCharArray();
		char[] nArray = needle.toCharArray();
		if((hArray.length == 0) && (nArray.length==0)){
			return 0;
		} else if(hArray.length < nArray.length){
			return -1;
		}
		int p1 = 0;
		while(p1 < (hArray.length - nArray.length +1)){
			if(isMatch(hArray, nArray, p1)){
				return p1;
			}
			p1++;
		}
		return -1;
	}
}
