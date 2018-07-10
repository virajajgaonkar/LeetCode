package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC212_Word_Search_iiTest {
	LC212_Word_Search_ii test = new LC212_Word_Search_ii();
	@Test
	public void test(){
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
}