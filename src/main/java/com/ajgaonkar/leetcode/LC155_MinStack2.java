package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC155_MinStack2 {
	private Long min = Long.MAX_VALUE;
	private final Stack<Long> data;
	/** initialize your data structure here. */
	public LC155_MinStack2() {
		data = new Stack<Long>();
	}

	public void push(int x) {
		if(data.isEmpty()){
			data.push(0L);
			min = (long)x;
		} else {
			data.push(x -min); //Could be negative if min value needs to change
			if(x < min){
				min = (long)x;
			}
		}
	}

	public void pop() {
		if(data.isEmpty()){
			return ;
		}
		long top = data.pop();
		if(top < 0){
			min = min - top; //If negative, increase the min value
		}
	}

	public int top() {

		if(data.peek() > 0){
			return (int)(data.peek() + min);
		} else {
			return min.intValue();
		}
	}

	public int getMin() {
		return min.intValue();
	}
}
