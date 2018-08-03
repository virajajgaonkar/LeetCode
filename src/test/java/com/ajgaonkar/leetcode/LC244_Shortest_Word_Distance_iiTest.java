package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC244_Shortest_Word_Distance_iiTest {
	@Test
	public void test(){
		LC244_Shortest_Word_Distance_ii test = new LC244_Shortest_Word_Distance_ii(new String[]{"practice", "makes", "perfect", "coding", "makes"});
		assertEquals(3, test.shortest("coding","practice"));
		assertEquals(1, test.shortest("makes","coding"));
	}
}