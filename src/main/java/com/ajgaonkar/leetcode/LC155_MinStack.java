package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC155_MinStack {
	private final Stack<Integer> data;
	private final Stack<Integer> minData;

	/** initialize your data structure here. */
	public LC155_MinStack() {
		data = new Stack<Integer>();
		minData = new Stack<Integer>();
	}

	public void push(int x) {
		data.push(x);
		if(!minData.isEmpty()){
			if (x > minData.peek()){
				return;
			}
		}
		minData.push(x);
	}

	public void pop() {
		int current = data.pop();
		if(current == minData.peek()){
			minData.pop();
		}
	}

	public int top() {
		return data.peek();
	}

	public int getMin() {
		return minData.peek();
	}
}
