package com.ajgaonkar.leetcode;

import java.util.Stack;

/**
 * Stack is a class
 *  st.empty(); => boolean st.empty();
 *  st.push(); => E st.push(E);
 *  st.peek(); => E st.peek(); EmptyStackException Runtime
 *  st.pop(); => E st.pop(); EmptyStackException Runtime
 */
public class CollectionsStack {
	private final Stack<Integer> stack;

	public CollectionsStack() {
		this.stack = new Stack<>();
	}

	public void test(){
		for(int i=10; i>=1; i--){
			stack.push(i);
		}

		while (!stack.empty()){
			Integer peeked = stack.peek();
			Integer popped = stack.pop();
			System.out.println("peeked = " +  peeked + " popped = " + popped);
		}
	}

	public static void main(String[] args){
		CollectionsStack test = new CollectionsStack();
		test.test();
	}
}
