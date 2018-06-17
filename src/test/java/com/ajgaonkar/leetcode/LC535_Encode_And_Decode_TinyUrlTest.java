package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC535_Encode_And_Decode_TinyUrlTest {
	@Test
	public void test(){
		String BASE = "http://www.google.com/search/link";
		LC535_Encode_And_Decode_TinyUrl test = new LC535_Encode_And_Decode_TinyUrl();
		for(int i = 0; i< 100; i++){
			String url = BASE + i;
			String tinyUrl = test.encode(url);
			assertTrue(url.length() > tinyUrl.length());
			assertEquals(url, test.decode(tinyUrl));
		}
	}
}