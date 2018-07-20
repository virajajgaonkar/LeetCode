package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class LC692_Top_K_Frequent_WordsTest {
	LC692_Top_K_Frequent_Words test = new LC692_Top_K_Frequent_Words();

	@Test
	public void test(){
		assertEquals(Arrays.asList("i", "love"), test.topKFrequent( new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
		assertEquals(Arrays.asList("the", "is", "sunny", "day"), test.topKFrequent( new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
		assertEquals(Arrays.asList("a", "b"), test.topKFrequent( new String[]{"a", "a", "b", "b", "c", "c", "d", "e"}, 2));
		assertEquals(Arrays.asList("a", "aa"), test.topKFrequent( new String[]{"a", "aa", "aaa"}, 2));
	}
}