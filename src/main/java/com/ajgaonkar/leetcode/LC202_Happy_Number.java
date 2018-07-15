package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//ToDo: Redo
public class LC202_Happy_Number {
	private int squaredNumber(List<Integer> lst){
		int sum = 0;
		for (int cur : lst){
			sum += (cur * cur);
		}
		return sum;
	}
	private boolean isHappy(int n, Set<Integer> seen) {
		if(seen.contains(n)){
			return false;
		}
		seen.add(n);
		int num = n;
		ArrayList<Integer> lst = new ArrayList<>();
		while (num > 9){
			int rem = num%10;
			num = num/10;
			lst.add(rem);
		}
		lst.add(num);
		int newInt = squaredNumber(lst);
		if(newInt == 1){
			return true;
		} else {
			return isHappy(newInt, seen);
		}
	}

	public boolean isHappy(int n) {
		return isHappy(n, new HashSet<>());
	}
}
