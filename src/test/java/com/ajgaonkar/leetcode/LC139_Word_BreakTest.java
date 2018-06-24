package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC139_Word_BreakTest {
//	LC139_Word_Break test = new LC139_Word_Break();
	LC139_Word_Break_2 test = new LC139_Word_Break_2();
	@Test
	public void test(){
		assertTrue(test.wordBreak("leetcode", Arrays.asList("leet", "code")));
		assertTrue(test.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
		assertFalse(test.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
	}
}