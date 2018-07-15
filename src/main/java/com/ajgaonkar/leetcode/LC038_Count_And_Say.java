package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

//ToDo: Redo
public class LC038_Count_And_Say {
	private List<Integer> countAndSay(List<Integer> input){
		int count = 0;
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < input.size(); ++i){
			count++;
			if(i < (input.size()-1)){
				if(input.get(i) == input.get(i +1)){
					continue;
				}
			}
			res.add(count);
			res.add(input.get(i));
			count=0;
		}
		return res;
	}
	public String convertIntListToString(List<Integer> res) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< res.size(); ++i){
			sb.append(res.get(i));
		}
		return sb.toString();
	}
	private List<Integer> countAndSayIntenal(int n) {
		List<Integer> res = new ArrayList<>();
		res.add(1);
		if(n ==1){
			return res;
		}
		for(int i=2; i<=n; ++i){
			res = countAndSay(res);
		}
		return res;
	}
	public String countAndSay(int n) {
		List<Integer> res = countAndSayIntenal(n);
		String str = convertIntListToString(res);
		return str;
	}
}
