package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC066_Plus_One {

	public int[] plusOne(int[] digits) {
		if (digits.length == 0){
			return new int[] {1};
		}
		Stack<Integer> res = new Stack<Integer>();
		int carry = 0;
		for(int i= digits.length -1; i >=0; i-- ){
			int sum = digits[i] + carry;
			if(i == digits.length -1){
				sum = sum +1;
			}
			carry = sum/10;
			int remainder = sum %10;
			res.push(remainder);
		}
		if(carry >0){
			res.push(carry);
		}
		int[] finalResult = new int[res.size()];
		int index = 0;
		while (!res.isEmpty()){
			finalResult[index] = res.pop();
			index++;
		}
		return finalResult;
	}
}
