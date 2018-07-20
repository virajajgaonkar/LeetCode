package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC622_Design_Circular_QueueTest {
	@Test
	public void test(){
		LC622_Design_Circular_Queue circularQueue = new LC622_Design_Circular_Queue(3);
		assertEquals(true, circularQueue.enQueue(1));
		assertEquals(true, circularQueue.enQueue(2));
		assertEquals(true, circularQueue.enQueue(3));
		assertEquals(false, circularQueue.enQueue(4));
		assertEquals(1, circularQueue.Front());
		assertEquals(3, circularQueue.Rear());
		assertEquals(true, circularQueue.isFull());
		assertEquals(true, circularQueue.deQueue());
		assertEquals(true, circularQueue.enQueue(4));
		assertEquals(2, circularQueue.Front());
		assertEquals(4, circularQueue.Rear());
	}

	@Test
	public void test2(){
		LC622_Design_Circular_Queue circularQueue = new LC622_Design_Circular_Queue(3);
		assertEquals(true, circularQueue.enQueue(1));
		assertEquals(true, circularQueue.enQueue(2));
		assertEquals(true, circularQueue.enQueue(3));
		assertEquals(false, circularQueue.enQueue(4));

		assertEquals(1, circularQueue.Front());
		assertEquals(3, circularQueue.Rear());
		assertEquals(true, circularQueue.isFull());

		assertEquals(true, circularQueue.deQueue());
		assertEquals(2, circularQueue.Front());
		assertEquals(3, circularQueue.Rear());
		assertEquals(false, circularQueue.isFull());

		assertEquals(true, circularQueue.deQueue());
		assertEquals(3, circularQueue.Front());
		assertEquals(3, circularQueue.Rear());
		assertEquals(false, circularQueue.isFull());

		assertEquals(true, circularQueue.deQueue());
		assertEquals(-1, circularQueue.Front());
		assertEquals(-1, circularQueue.Rear());
		assertEquals(false, circularQueue.isFull());


		assertEquals(true, circularQueue.enQueue(4));
		assertEquals(4, circularQueue.Front());
		assertEquals(4, circularQueue.Rear());
		assertEquals(false, circularQueue.isFull());
	}
}