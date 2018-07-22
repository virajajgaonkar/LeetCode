package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC387_First_Unique_Character_In_A_StringTest {
	LC387_First_Unique_Character_In_A_String test = new LC387_First_Unique_Character_In_A_String();

	@Test
	public void test(){
		assertEquals(0, test.firstUniqChar("leetcode"));
		assertEquals(2, test.firstUniqChar("loveleetcode"));
	}
}