package com.ajgaonkar.leetcode;

public class LC066_Plus_One2 {
	public int[] plusOne(int[] digits) {
		for(int i = digits.length -1; i >= 0; i--){
			if(digits[i] < 9){
				digits[i] = digits[i] +1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length +1];
		result[0] = 1;
		return result;
	}
}
