package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC208_Trie_PrefixTreeTest {
	@Test
	public void test(){
		LC208_Trie_PrefixTree trie = new LC208_Trie_PrefixTree();

		trie.insert("apple");
		assertTrue(trie.search("apple"));   // returns true
		assertFalse(trie.search("app"));     // returns false
		assertTrue(trie.startsWith("app")); // returns true
		trie.insert("app");
		assertTrue(trie.search("app"));     // returns true
	}

}