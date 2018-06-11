package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LC017_Letter_Combinations_Of_A_Phone_NumberTest {
	@Test
	public void test(){
		LC017_Letter_Combinations_Of_A_Phone_Number test = new LC017_Letter_Combinations_Of_A_Phone_Number();
		List<String> actual = test.letterCombinations("23");
		List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

		assertEquals(actual.size(), expected.size());
		assertTrue(actual.containsAll(expected));
		assertTrue(expected.containsAll(actual));

	}

	@Test
	public void test2(){
		LC017_Letter_Combinations_Of_A_Phone_Number test = new LC017_Letter_Combinations_Of_A_Phone_Number();
		List<String> actual = test.letterCombinations("");
		List<String> expected = Collections.emptyList();

		assertEquals(actual.size(), expected.size());
		assertTrue(actual.containsAll(expected));
		assertTrue(expected.containsAll(actual));

	}

}