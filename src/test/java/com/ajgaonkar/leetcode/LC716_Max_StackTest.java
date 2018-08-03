package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC716_Max_StackTest {

	@Test
	public void test(){
		LC716_Max_Stack test = new LC716_Max_Stack();
		test.push(4);
		test.push(5);
		test.push(6);
		test.push(1);
		test.push(2);
		test.push(3);

		assertEquals(3, test.top());
		assertEquals(6, test.peekMax());
		assertEquals(6, test.popMax());
		assertEquals(3, test.pop());

		assertEquals(2, test.top());
		assertEquals(5, test.peekMax());
		assertEquals(5, test.popMax());
		assertEquals(2, test.pop());

		assertEquals(1, test.top());
		assertEquals(4, test.peekMax());
		assertEquals(4, test.popMax());
		assertEquals(1, test.pop());
	}


	@Test
	public void test2(){
		LC716_Max_Stack test = new LC716_Max_Stack();
		test.push(1);
		test.push(4);
		test.push(2);
		test.push(3);
		test.push(5);
		test.push(6);

		assertEquals(6, test.peekMax());
		assertEquals(6, test.popMax());
		assertEquals(5, test.peekMax());
		assertEquals(5, test.popMax());

		assertEquals(3, test.top());
		assertEquals(4, test.peekMax());

		assertEquals(3, test.pop());
		assertEquals(4, test.popMax());

		assertEquals(2, test.top());
		assertEquals(2, test.pop());

		assertEquals(1, test.top());
		assertEquals(1, test.pop());
	}

	@Test
	public void test3() {
		LC716_Max_Stack test = new LC716_Max_Stack();
		test.push(5);
		test.push(1);
		test.push(5);

		assertEquals(5, test.top());
		assertEquals(5, test.popMax());

		assertEquals(1, test.top());
		assertEquals(5, test.peekMax());

		assertEquals(1, test.pop());
		assertEquals(5, test.top());
	}

}