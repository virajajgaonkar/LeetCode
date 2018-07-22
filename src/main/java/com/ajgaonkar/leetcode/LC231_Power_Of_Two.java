package com.ajgaonkar.leetcode;

public class LC231_Power_Of_Two {
	public boolean isPowerOfTwo(int n) {
		// 2^x = n
		//x * Log(2) = Log(n)
		//x = (Log(n))/(Log(2))
		double x= Math.log(n) / Math.log(2);
		return (Math.abs(x - Math.rint(x)) <= 0.00000000000001 );
	}
}
