package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC155_MinStackTest {
	@Test
	public void test(){
		LC155_MinStack minStack = new LC155_MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();
		assertEquals(minStack.top(), 0);
		assertEquals(minStack.getMin(), -2);
	}

	@Test
	public void test2(){
		LC155_MinStack minStack = new LC155_MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.push(-3);
		minStack.push(4);
		minStack.push(-3);
		minStack.push(-3);

		assertEquals(minStack.top(), -3);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();

		assertEquals(minStack.top(), -3);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();

		assertEquals(minStack.top(), 4);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();

		assertEquals(minStack.top(), -3);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();

		assertEquals(minStack.top(), -3);
		assertEquals(minStack.getMin(), -3);
		minStack.pop();

		assertEquals(minStack.top(), 0);
		assertEquals(minStack.getMin(), -2);
		minStack.pop();

		assertEquals(minStack.top(), -2);
		assertEquals(minStack.getMin(), -2);
		minStack.pop();
	}
}