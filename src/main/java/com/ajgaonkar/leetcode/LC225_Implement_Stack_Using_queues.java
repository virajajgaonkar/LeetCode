package com.ajgaonkar.leetcode;

import java.util.LinkedList;

//ToDo: Redo
public class LC225_Implement_Stack_Using_queues {
	private final LinkedList<Integer> list;

	/** Initialize your data structure here. */
	public LC225_Implement_Stack_Using_queues() {
		list = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		list.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		int ret = list.get(list.size() -1);
		list.remove(list.size() -1);
		return ret;
	}

	/** Get the top element. */
	public int top() {
		return list.get(list.size() -1);

	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return (list.size() == 0);
	}
}
