package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC243_Shortest_Word_DistanceTest {
	LC243_Shortest_Word_Distance test = new LC243_Shortest_Word_Distance();

	@Test
	public void test(){
		assertEquals(3, test.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding" , "practice"));
		assertEquals(1, test.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
	}
}