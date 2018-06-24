package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC316_Remove_Duplicate_LettersTest {
//	LC316_Remove_Duplicate_Letters test = new LC316_Remove_Duplicate_Letters();
//	LC316_Remove_Duplicate_Letters_2 test = new LC316_Remove_Duplicate_Letters_2();
	LC316_Remove_Duplicate_Letters_3 test = new LC316_Remove_Duplicate_Letters_3();
	@Test
	public void test(){
		Assert.assertEquals("abc", test.removeDuplicateLetters("bcabc"));
		Assert.assertEquals("acdb", test.removeDuplicateLetters("cbacdcbc"));
	}
}