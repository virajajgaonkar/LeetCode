package com.ajgaonkar.leetcode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LC535_Tiny_Url {
	private final Random random = new Random((new Date()).getTime());
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private final Map<String, String> urls = new HashMap<String, String>();

	private String generateRandomString(int length){
		StringBuilder sb = new StringBuilder();
		for (int i =0; i < length; i++){
			int count = random.nextInt(1000);
			sb.append(ALPHA_NUMERIC_STRING.charAt(count % ALPHA_NUMERIC_STRING.length()));
		}
		return sb.toString();
	}

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String code = generateRandomString(8);
		while (urls.containsKey(code)){
			code = generateRandomString(8);
		}
		urls.put(code, longUrl);
		return "http://tinyurl.com/" + code;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String code = shortUrl.replace("http://tinyurl.com/", "");
		return urls.get(code);
	}
}
