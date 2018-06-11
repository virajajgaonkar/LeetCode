package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC535_Tiny_UrlTest {
	LC535_Tiny_Url test = new LC535_Tiny_Url();
	@Test
	public void test(){
		for(int i =0; i < 100; i++){
			String url = "https://leetcode.com/problems/design-tinyurl/" + i;
			String tinyUrl = test.encode(url);
			String actual = test.decode(tinyUrl);
			assertEquals(url, actual);
		}
	}

}