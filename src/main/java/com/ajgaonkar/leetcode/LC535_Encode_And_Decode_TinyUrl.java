package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LC535_Encode_And_Decode_TinyUrl {
	private static final List<Character> RANGE;
	static {
		RANGE = new ArrayList<Character>();
		char start = '0';
		for(int i=0; i<10; i++){
			RANGE.add(new Character((char) (start + i)));
		}
		start = 'a';
		for(int i=0; i<26; i++){
			RANGE.add(new Character((char) (start + i)));
		}
		start = 'A';
		for(int i=0; i<26; i++){
			RANGE.add(new Character((char) (start + i)));
		}
	}
	private static final Random RANDOM = new Random();
	private final Map<String, String> URLS = new HashMap<String, String>();

	private static final String generateRandomStringOfLength(int length){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< length; i++){
			sb.append(RANGE.get(RANDOM.nextInt(RANGE.size() -1)));
		}
		return sb.toString();
	}

	private static final String generateRandomString(){
		return generateRandomStringOfLength(6);
	}

	private final String getNewKey(){
		String newKey = generateRandomString();
		while (URLS.containsKey(newKey)){
			newKey = generateRandomString();
		}
		return newKey;
	}

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String newKey = getNewKey();
		URLS.put(newKey, longUrl);
		return "http://tinyurl.com/" + newKey;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String code = shortUrl.replace("http://tinyurl.com/", "");
		return URLS.get(code);
	}
}
