package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LC641_Design_Circular_Deque_2Test {
	@Test
	public void test(){
		LC641_Design_Circular_Deque_2 circularDeque = new LC641_Design_Circular_Deque_2(3); // set the size to be 3
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
	public void test2(){
		LC641_Design_Circular_Deque_2 circularDeque = new LC641_Design_Circular_Deque_2(77); // set the size to be 3
		assertEquals(true, circularDeque.insertFront(89));
		assertEquals(89, circularDeque.getRear());
		assertEquals(true, circularDeque.deleteLast());
		assertEquals(-1, circularDeque.getRear());
		assertEquals(true, circularDeque.insertFront(19));
		assertEquals(true, circularDeque.insertFront(23));
		assertEquals(true, circularDeque.insertFront(23));
		assertEquals(true, circularDeque.insertFront(82));
		assertEquals(false, circularDeque.isFull());
		assertEquals(true, circularDeque.insertFront(45));
		assertEquals(false, circularDeque.isFull());
		assertEquals(89, circularDeque.getRear());
		assertEquals(true, circularDeque.deleteLast());
		assertEquals(45, circularDeque.getFront());
		assertEquals(45, circularDeque.getFront());
		assertEquals(true, circularDeque.insertLast(74));

		/*
		"deleteFront","getFront","insertLast","getRear","insertLast","getRear","getFront","getFront","getFront","getRear","getRear","insertFront","getFront","getFront","getFront","getFront","deleteFront","insertFront","getFront","deleteLast","insertLast","insertLast","getRear","getRear","getRear","isEmpty","insertFront","deleteLast","getFront","deleteLast","getRear","getFront","isFull","isFull","deleteFront","getFront","deleteLast","getRear","insertFront","getFront","insertFront","insertFront","getRear","isFull","getFront","getFront","insertFront","insertLast","getRear","getRear","deleteLast","insertFront","getRear","insertLast","getFront","getFront","getFront","getRear","insertFront","isEmpty","getFront","getFront","insertFront","deleteFront","insertFront","deleteLast","getFront","getRear","getFront","insertFront","getFront","deleteFront","insertFront","isEmpty","getRear","getRear","getRear","getRear","deleteFront","getRear","isEmpty","deleteFront","insertFront","insertLast","deleteLast"
				[],[],[98],[],[99],[],[],[],[],[],[],[8],[],[],[],[],[],[75],[],[],[35],[59],[],[],[],[],[22],[],[],[],[],[],[],[],[],[],[],[],[21],[],[26],[63],[],[],[],[],[87],[76],[],[],[],[26],[],[67],[],[],[],[],[36],[],[],[],[72],[],[87],[],[],[],[],[85],[],[],[91],[],[],[],[],[],[],[],[],[],[34],[44],[]
		*/

	}

	@Test
	public void test3(){
		LC641_Design_Circular_Deque_2 circularDeque = new LC641_Design_Circular_Deque_2(52);
		assertEquals(true, circularDeque.insertFront(80));
		assertEquals(80, circularDeque.getFront());
		assertEquals(true, circularDeque.insertFront(27));
		assertEquals(27, circularDeque.getFront());
		assertEquals(true, circularDeque.deleteLast());
		assertEquals(true, circularDeque.insertFront(60));
		assertEquals(true, circularDeque.insertFront(81));
		assertEquals(27, circularDeque.getRear());
		assertEquals(81, circularDeque.getFront());

		/*
		"getRear","getRear","insertLast","deleteFront","getFront","insertLast","getRear","insertLast","deleteFront","insertFront","isFull","getRear","deleteLast","insertLast","getRear","getFront","getFront","insertLast","insertFront","deleteFront","getRear","insertLast","deleteFront","insertFront","insertFront","getRear","getFront","insertFront","insertLast","getRear","getFront","insertFront","insertFront","insertLast","insertLast","getRear","isEmpty","deleteFront","getRear","getRear","getRear","insertLast","getFront","getFront","deleteLast","deleteLast","insertLast","getRear","getRear","insertLast","insertLast","insertFront","getFront","getRear","getFront","insertFront","insertFront","deleteFront","isEmpty","getFront","deleteFront","isFull","getFront","getRear","insertLast","getFront","insertLast","getRear","insertLast","insertFront","getRear","getFront","getFront","deleteLast","deleteLast","insertLast","getRear","getRear","getFront","deleteLast","isFull","insertLast","insertLast","insertFront","getFront","insertFront","isFull","getRear","insertFront","deleteLast","insertLast","insertLast"
				[],[],[46],[],[],[98],[],[11],[],[51],[],[],[],[28],[],[],[],[28],[69],[],[],[11],[],[25],[74],[],[],[48],[7],[],[],[65],[59],[23],[32],[],[],[],[],[],[],[84],[],[],[],[],[64],[],[],[17],[34],[46],[],[],[],[6],[20],[],[],[],[],[],[],[],[34],[],[66],[],[54],[34],[],[],[],[],[],[43],[],[],[],[],[],[21],[93],[79],[],[8],[],[],[78],[],[7],[67]

				*/

	}

	@Test
	public void test4(){
		LC641_Design_Circular_Deque_2 circularDeque = new LC641_Design_Circular_Deque_2(2);
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

		//[null,true,true,-1,true,true,0,0,0,0,0,false]
		//[null,true,true,-1,true,true,0,5,0,0,5,false]

	}

}