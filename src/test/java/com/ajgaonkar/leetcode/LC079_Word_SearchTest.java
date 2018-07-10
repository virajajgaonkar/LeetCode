package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC079_Word_SearchTest {
	LC079_Word_Search test = new LC079_Word_Search();
	@Test
	public void test(){
		char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
		assertEquals(true, test.exist(board, "ABCCED"));
		assertEquals(true, test.exist(board, "SEE"));
		assertEquals(false, test.exist(board, "ABCB"));
	}
}