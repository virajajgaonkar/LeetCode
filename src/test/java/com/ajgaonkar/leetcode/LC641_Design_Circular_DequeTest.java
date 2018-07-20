package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC641_Design_Circular_DequeTest {
	@Test
	public void test(){
		LC641_Design_Circular_Deque circularDeque = new LC641_Design_Circular_Deque(3); // set the size to be 3
		assertEquals(true, circularDeque.insertLast(1));
		assertEquals(true, circularDeque.insertLast(2));
		assertEquals(true, circularDeque.insertFront(3));
		assertEquals(false, circularDeque.insertFront(4));

		assertEquals(2, circularDeque.getRear());
		assertEquals(true, circularDeque.isFull());
		assertEquals(true, circularDeque.deleteLast());
		assertEquals(true, circularDeque.insertFront(4));
		assertEquals(4, circularDeque.getFront());
	}

	@Test
	public void test4(){
		LC641_Design_Circular_Deque circularDeque = new LC641_Design_Circular_Deque(2);
		assertEquals(true, circularDeque.insertFront(7));
		assertEquals(true, circularDeque.deleteLast());
		assertEquals(-1, circularDeque.getFront());
		assertEquals(true, circularDeque.insertLast(5));
		assertEquals(true, circularDeque.insertFront(0));
		assertEquals(0, circularDeque.getFront());
		assertEquals(5, circularDeque.getRear());
		assertEquals(0, circularDeque.getFront());
		assertEquals(0, circularDeque.getFront());
		assertEquals(5, circularDeque.getRear());
		assertEquals(false, circularDeque.insertLast(0));
	}
}