package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.Set;

//ToDo: Redo
public class LC507_Perfect_Number {
	public boolean checkPerfectNumber(int num) {
		if(num ==1){return false;}
		Set<Integer> seen = new HashSet<>();
		int perfectSum = 1;
		for(int i =2; i<= ((num)/2); ++i){
			if(seen.contains(i)){
				break;
			}
			if((num % i) ==0){
				seen.add(i);
				perfectSum += i;
				seen.add(num/i);
				perfectSum += (num/i);
			}
			if(perfectSum > num){
				return false;
			}
		}
		return (perfectSum == num);

	}
}
