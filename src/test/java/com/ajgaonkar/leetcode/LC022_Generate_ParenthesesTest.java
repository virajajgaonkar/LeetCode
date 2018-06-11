package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class LC022_Generate_ParenthesesTest {
	LC022_Generate_Parentheses test = new LC022_Generate_Parentheses();
	@Test
	public void test(){
		List<String> result = test.generateParenthesis(3);
		assertArrayEquals(result.toArray(), new String[]{"((()))", "(()())","(())()","()(())","()()()"});
	}

}