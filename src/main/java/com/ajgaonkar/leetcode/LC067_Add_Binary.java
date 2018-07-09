package com.ajgaonkar.leetcode;

public class LC067_Add_Binary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		int i1 = c1.length -1;
		int i2 = c2.length -1;
		int carry = 0;
		while ((i1 >=0) || (i2 >=0)){
			int first = (i1 >=0) ? (c1[i1] - '0'): 0;
			int second = (i2 >=0) ? (c2[i2] - '0'): 0;
			int res = carry + first +  second;
			if(res == 0){
				carry = 0;
				sb.insert(0, 0);
			} else if (res ==1){
				carry = 0;
				sb.insert(0, 1);
			} else if (res == 2){
				carry = 1;
				sb.insert(0, 0);
			} else {
				carry = 1;
				sb.insert(0, 1);
			}
			i1--;
			i2--;
		}
		if(carry == 1){
			sb.insert(0, 1);
		}
		return sb.toString();
	}
}
