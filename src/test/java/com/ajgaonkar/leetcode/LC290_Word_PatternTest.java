package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC290_Word_PatternTest {
	LC290_Word_Pattern test = new LC290_Word_Pattern();
	@Test
	public void test(){
		assertEquals(true, test.wordPattern("abba", "dog cat cat dog"));
		assertEquals(false, test.wordPattern("abba", "dog cat cat fish"));
		assertEquals(false, test.wordPattern("aaaa", "dog cat cat dog"));
		assertEquals(false, test.wordPattern("abba", "dog dog dog dog"));
		assertEquals(true, test.wordPattern("abcdbdac", "all boy cat dog boy dog all cat"));
	}
}