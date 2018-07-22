package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC345_Reverse_Vowels_Of_A_StringTest {
	LC345_Reverse_Vowels_Of_A_String test = new LC345_Reverse_Vowels_Of_A_String();

	@Test
	public void test(){
		assertEquals(null, test.reverseVowels(null));
		assertEquals("", test.reverseVowels(""));
		assertEquals("bcdoslksjea", test.reverseVowels("bcdaslksjeo"));
		assertEquals("hello", test.reverseVowels("holle"));
		assertEquals("leetcode", test.reverseVowels("leotcede"));
		assertEquals("lEetcOde", test.reverseVowels("leOtcedE"));
	}
}