package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC362_Design_Hit_CounterTest {
	@Test
	public void test(){
		LC362_Design_Hit_Counter counter = new LC362_Design_Hit_Counter();

		// hit at timestamp 1.
		counter.hit(1);

		// hit at timestamp 2.
		counter.hit(2);

		// hit at timestamp 3.
		counter.hit(3);

		// get hits at timestamp 4, should return 3.
		assertEquals(3, counter.getHits(4));

		// hit at timestamp 300.
		counter.hit(300);

		// get hits at timestamp 300, should return 4.
		assertEquals(4, counter.getHits(300));

		// get hits at timestamp 301, should return 3.
		assertEquals(3, counter.getHits(301));
	}

	@Test
	public void test2(){
		LC362_Design_Hit_Counter counter = new LC362_Design_Hit_Counter();

		// hit at timestamp 1.
		counter.hit(1);
		counter.hit(1);
		counter.hit(1);
		counter.hit(300);
		assertEquals(4, counter.getHits(300));

		counter.hit(300);
		assertEquals(5, counter.getHits(300));
	}
}