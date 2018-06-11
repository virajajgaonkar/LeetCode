package com.ajgaonkar.leetcode;

import org.junit.Test;
import sun.misc.LRUCache;

import static org.junit.Assert.*;

public class LC146_LRU_CacheTest {
	@Test
	public void test(){
		LC146_LRU_Cache cache = new LC146_LRU_Cache(3);
		cache.put(1, 1);
		assertEquals(cache.get(1), 1);
		assertEquals(cache.get(2), -1);
		assertEquals(cache.get(3), -1);

		cache.put(2, 2);
		assertEquals(cache.get(1), 1);
		assertEquals(cache.get(2), 2);
		assertEquals(cache.get(3), -1);

		cache.put(3, 3);
		assertEquals(cache.get(1), 1);
		assertEquals(cache.get(2), 2);
		assertEquals(cache.get(3), 3);

		assertEquals(cache.get(2), 2);
		assertEquals(cache.get(1), 1);

		cache.put(4, 4);
		assertEquals(cache.get(3), -1);
		assertEquals(cache.get(1), 1);
		assertEquals(cache.get(2), 2);
		assertEquals(cache.get(4), 4);
	}

	@Test
	public void test2() {
		LC146_LRU_Cache cache = new LC146_LRU_Cache(2);
		cache.put(2, 1);
		cache.put(2, 2);
		assertEquals(cache.get(2), 2);
		cache.put(1, 1);
		cache.put(4, 1);
		assertEquals(cache.get(2), -1);
	}
}