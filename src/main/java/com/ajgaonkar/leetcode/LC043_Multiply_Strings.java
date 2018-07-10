package com.ajgaonkar.leetcode;

public class LC043_Multiply_Strings {
	private int[] stringToIntArr(String input){
		int[] res = new int[input.length()];
		for (int i=0; i< input.length(); i++){
			res[i] = input.charAt(i) - '0';
		}
		return res;
	}
	private String intArrToString(int[] input){
		StringBuffer sb = new StringBuffer();
		int i=0;
		while ((i < input.length) && (input[i] ==0)){
			i++;
		}
		for (; i< input.length; i++){
			sb.append(input[i]);
		}
		return sb.toString();
	}

	public String multiply(String num1, String num2) {
		int[] n1 = stringToIntArr(num1);
		int[] n2 = stringToIntArr(num2);
		int[] res = new int[n1.length + n2.length];

		for (int j=n2.length-1; j>=0; j--){
			int carry = 0;
			for(int i=n1.length-1; i>=0; i--){
				int prod = carry + res[i+j+1] + (n1[i] * n2[j]);
				carry = prod/10;
				res[i+j +1] = prod % 10;
			}
			if(carry>0){
				res[j] = carry;
			}
		}
		String result = intArrToString(res);
		return (result.length() == 0) ? "0": result;
	}
}
