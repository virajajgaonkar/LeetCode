package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC049_Group_AnagramsTest {
	LC049_Group_Anagrams test = new LC049_Group_Anagrams();
	@Test
	public void test(){
		List<List<String>> actual = test.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		List<List<String>> expected = Arrays.asList(Arrays.asList("eat","tea","ate"), Arrays.asList("bat"),Arrays.asList("tan", "nat"));
		assertEquals(actual, expected);
	}
}