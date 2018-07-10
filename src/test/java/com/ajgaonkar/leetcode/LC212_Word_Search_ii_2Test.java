package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC212_Word_Search_ii_2Test {
	LC212_Word_Search_ii_2 test = new LC212_Word_Search_ii_2();
	@Test
	public void test(){
		LC212_Word_Search_ii_2.Trie trie = new LC212_Word_Search_ii_2.Trie();
		trie.add("oath");
		trie.add("pea");
		trie.add("eat");
		trie.add("rain");
		assertEquals(true, trie.startsWith("oath"));
		assertEquals(true, trie.startsWith("pea"));
		assertEquals(true, trie.startsWith("eat"));
		assertEquals(true, trie.startsWith("rain"));
		assertEquals(false, trie.startsWith("abcd"));

		assertEquals(true, trie.contains("oath"));
		assertEquals(true, trie.contains("pea"));
		assertEquals(true, trie.contains("eat"));
		assertEquals(true, trie.contains("rain"));
		assertEquals(false, trie.startsWith("abcd"));
	}
	@Test
	public void test1(){
		String[] words = {"oath","pea","eat","rain"};
		char[][] board = {{'o','a','a','n'}, {'e','t','a','e'}, {'i','h','k','r'}, {'i','f','l','v'}};
		List<String> expected = Arrays.asList("oath", "eat");
		List<String> actual = test.findWords(board, words);
		assertEquals(actual, expected);
	}

	@Test
	public void test2(){
		String[] words = {"a","a"};
		char[][] board = {{'a'}};
		List<String> expected = Arrays.asList("a");
		List<String> actual = test.findWords(board, words);
		assertEquals(actual, expected);
	}

	@Test
	public void test3(){
		String[] words = {"a"};
		char[][] board = {{'a', 'a'}};
		List<String> expected = Arrays.asList("a");
		List<String> actual = test.findWords(board, words);
		assertEquals(actual, expected);
	}

}