package com.ajgaonkar.leetcode;

public class LC050_Pow_X_N {
	public double myPow(double x, int n) {
		if (n ==0) {
			return 1;
		} else if(n == 1){
			return x;
		} else if(n == -1){
			return 1/x;
		}
		double intermediate = myPow(x, n/2);
		if(n % 2 == 0){
			return intermediate * intermediate;
		} else {
			if(n <0){
				return intermediate * intermediate * (1/x);
			} else {
				return intermediate * intermediate * x;
			}
		}
	}
}
