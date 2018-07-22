package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC760_Find_Anagram_MappingsTest {
	LC760_Find_Anagram_Mappings test = new LC760_Find_Anagram_Mappings();

	@Test
	public void test(){
		int[] actual = test.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});
		int[] expected = new int[]{1, 4, 3, 2, 0};
		assertArrayEquals(actual, expected);
	}

}