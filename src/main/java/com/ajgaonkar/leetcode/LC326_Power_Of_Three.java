package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.log;
import static java.lang.Math.rint;
import static java.lang.StrictMath.abs;

public class LC326_Power_Of_Three {
	public boolean isPowerOfThree(int n) {
		return isPowerOfThree1(n);
	}


	public boolean isPowerOfThree3(int n) {
		double a = log(n) / log(3);
		return abs(a - rint(a)) <= 0.00000000000001;
	}
	public boolean isPowerOfThree1(int n) {
		if(n <= 0){
			return false;
		}
		Map<Integer, Integer> res = new HashMap<>();
		int count = 0;

		while (n > 1){
			if((n % 3) != 0){
				return false;
			}
			n = n/3;
			count++;
		}
		return true;
	}

	public boolean isPowerOfThree2(int n) {
		int i=0;
		double prod = Math.pow(3, i);
		while (prod <= n){
			if(prod == n){
				return true;
			}
			i++;
			prod = Math.pow(3, i);
		}
		return false;
	}
}
