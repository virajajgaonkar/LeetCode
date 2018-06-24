package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC388_Longest_Absolute_File_PathTest {
	LC388_Longest_Absolute_File_Path obj = new LC388_Longest_Absolute_File_Path();
	@Test
	public void test(){
		assertEquals(20, obj.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
		assertEquals(32, obj.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
		assertEquals(12, obj.lengthLongestPath("dir\n    file.txt"));
	}
}