package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC050_Powx_N {
	public double myPowHelper(double x, int n){
		double result = 1;
		for(int i=0; i< n; ++i){
			result = result * x;
			if(result == 0){
				return 0;
			}
		}
		return result;
	}

	public double myPow(double x, int n) {
		if(x == 1){return 1;}
		if(x == -1) {
			return (n %2 == 0) ? (-1 * x) : x;
		}
		if(n == 0) {return 1;}
		if((n < -15) && (x > 1)) {return 0;}
		int absN = Math.abs(n);

		double v = myPowHelper(x, absN/2);
		if(n % 2 == 0){
			v =  v * v;
		} else {
			v = v * v * x;
		}

		if(n< 0){
			return (1/v);
		} else {
			return v;
		}
	}
}
