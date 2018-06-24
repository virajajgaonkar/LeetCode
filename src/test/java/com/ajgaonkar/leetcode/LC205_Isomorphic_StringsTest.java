package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC205_Isomorphic_StringsTest {
	LC205_Isomorphic_Strings test = new LC205_Isomorphic_Strings();
	@Test
	public void test(){
		assertEquals(true, test.isIsomorphic("egg", "add"));
		assertEquals(false, test.isIsomorphic("foo", "bar"));
		assertEquals(true, test.isIsomorphic("paper", "title"));
		assertEquals(false, test.isIsomorphic("pper", "tile"));
	}
}