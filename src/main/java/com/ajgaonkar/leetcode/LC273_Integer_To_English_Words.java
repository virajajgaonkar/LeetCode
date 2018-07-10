package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC273_Integer_To_English_Words {
	private static final Map<Integer, String> MAP = new HashMap<>();
	static {
		MAP.put(1, "One");
		MAP.put(2, "Two");
		MAP.put(3, "Three");
		MAP.put(4, "Four");
		MAP.put(5, "Five");
		MAP.put(6, "Six");
		MAP.put(7, "Seven");
		MAP.put(8, "Eight");
		MAP.put(9, "Nine");
		MAP.put(10, "Ten");
		MAP.put(11, "Eleven");
		MAP.put(12, "Twelve");
		MAP.put(13, "Thirteen");
		MAP.put(14, "Fourteen");
		MAP.put(15, "Fifteen");
		MAP.put(16, "Sixteen");
		MAP.put(17, "Seventeen");
		MAP.put(18, "Eighteen");
		MAP.put(19, "Nineteen");
	}
	private static final Map<Integer, String> TEN_MAP = new HashMap<>();
	static {
		TEN_MAP.put(1, "Ten");
		TEN_MAP.put(2, "Twenty");
		TEN_MAP.put(3, "Thirty");
		TEN_MAP.put(4, "Forty");
		TEN_MAP.put(5, "Fifty");
		TEN_MAP.put(6, "Sixty");
		TEN_MAP.put(7, "Seventy");
		TEN_MAP.put(8, "Eighty");
		TEN_MAP.put(9, "Ninety");


	}
	private enum Digits{
		BILLION(1000000000, "Billion"),
		MILLION(1000000, "Million"),
		THOUSAND(1000, "Thousand"),
		HUNDRED(100, "Hundred"),
		TEN(10, "");
		private final long val;
		private final String text;

		Digits(long val, String text) {
			this.val = val;
			this.text = text;
		}
	}

	private void numberToWords(int num, StringBuffer sb){
		if(num == 0){
			sb.append("Zero");
			return;
		}
		int number = num;
		for (Digits current : Digits.values()){
			if(number < 20){
				sb.append(MAP.get(number));
				return;
			}
			int quotient = (int) (number/current.val);
			int remainder = (int) (number % current.val);
			if(quotient > 0){
				if(current != Digits.TEN) {
					numberToWords(quotient, sb);
					sb.append(" ");
					sb.append(current.text);
					sb.append(" ");
				} else {
					sb.append(TEN_MAP.get(quotient));
					sb.append(" ");
				}
			}
			number = remainder;
			if(number == 0){
				return;
			}
		}
		if(number >0){
			sb.append(MAP.get(number));
		}
	}

	public String numberToWords(int num) {
		StringBuffer sb = new StringBuffer();
		numberToWords(num, sb);
		return sb.toString().trim();
	}
}
