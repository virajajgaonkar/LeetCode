package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC739_Daily_Temperatures {
	//See LC496
	public int[] dailyTemperatures(int[] temperatures) {
		int[] res = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		for(int i =0; i < temperatures.length; i ++){
			while ((!stack.isEmpty()) && (temperatures[stack.peek()] < temperatures[i])){
				res[stack.peek()] = i - stack.pop();
			}
			stack.push(i);
		}
		return res;
	}




























	public int[] dailyTemperatures2(int[] temperatures) {
		final int m = temperatures.length;
		final Map<Integer, Integer> next = new HashMap<>();
		final Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < m; i++) {
			while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
				next.put(stack.peek(), i - stack.pop());
			}
			stack.push(i);
		}
		final int[] ans = new int[m];
		for (int i = 0; i < m; i++) {
			ans[i] = next.getOrDefault(i, 0);
		}
		return ans;
	}
}
