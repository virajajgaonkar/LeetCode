package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC460_LFU_CacheTest {
	@Test
	public void test(){
		LC460_LFU_Cache test = new LC460_LFU_Cache(2);
		test.put(1,1);
		test.put(2,2);
		assertEquals(1, test.get(1));
		assertEquals(1, test.get(1));
		assertEquals(1, test.get(1));
		assertEquals(2, test.get(2));
		assertEquals(-1, test.get(3));
		test.put(3,3);
		assertEquals(1, test.get(1));
		assertEquals(-1, test.get(2));
		assertEquals(3, test.get(3));
	}

	@Test
	public void test2(){
		LC460_LFU_Cache test = new LC460_LFU_Cache(3);
		test.put(1,1);
		test.put(2,2);
		test.put(3,3);
		assertEquals(1, test.get(1));
		assertEquals(1, test.get(1));
		assertEquals(1, test.get(1));
		assertEquals(3, test.get(3));
		assertEquals(2, test.get(2));
		assertEquals(-1, test.get(4));

		test.put(4,4);
		assertEquals(1, test.get(1));
		assertEquals(2, test.get(2));
		assertEquals(-1, test.get(3));
		assertEquals(4, test.get(4));
		assertEquals(4, test.get(4));


		test.put(1,11);
		test.put(2,12);
		test.put(4,14);


		assertEquals(11, test.get(1));
		assertEquals(12, test.get(2));
		assertEquals(-1, test.get(3));
		assertEquals(14, test.get(4));
	}

	@Test
	public void test3(){
//		["LFUCache","put","get","put","get","get"]
//		[[1],[2,1],[2],[3,2],[2],[3]]

		LC460_LFU_Cache test = new LC460_LFU_Cache(1);
		test.put(2,1);

		assertEquals(1, test.get(2));

		test.put(3,2);

		assertEquals(-1, test.get(2));
		assertEquals(2, test.get(3));
	}
}