package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC687_Longest_Univalue_PathTest {
	LC687_Longest_Univalue_Path test = new LC687_Longest_Univalue_Path();

	@Test
	public void test1(){
		LC687_Longest_Univalue_Path.TreeNode t1 = new LC687_Longest_Univalue_Path.TreeNode(5);
		LC687_Longest_Univalue_Path.TreeNode t2 = new LC687_Longest_Univalue_Path.TreeNode(4);
		LC687_Longest_Univalue_Path.TreeNode t3 = new LC687_Longest_Univalue_Path.TreeNode(5);
		LC687_Longest_Univalue_Path.TreeNode t4 = new LC687_Longest_Univalue_Path.TreeNode(1);
		LC687_Longest_Univalue_Path.TreeNode t5 = new LC687_Longest_Univalue_Path.TreeNode(1);
		LC687_Longest_Univalue_Path.TreeNode t6 = new LC687_Longest_Univalue_Path.TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;

		assertEquals(2, test.longestUnivaluePath(t1));
	}

	@Test
	public void test2(){
		LC687_Longest_Univalue_Path.TreeNode t1 = new LC687_Longest_Univalue_Path.TreeNode(1);
		LC687_Longest_Univalue_Path.TreeNode t2 = new LC687_Longest_Univalue_Path.TreeNode(4);
		LC687_Longest_Univalue_Path.TreeNode t3 = new LC687_Longest_Univalue_Path.TreeNode(5);
		LC687_Longest_Univalue_Path.TreeNode t4 = new LC687_Longest_Univalue_Path.TreeNode(4);
		LC687_Longest_Univalue_Path.TreeNode t5 = new LC687_Longest_Univalue_Path.TreeNode(4);
		LC687_Longest_Univalue_Path.TreeNode t6 = new LC687_Longest_Univalue_Path.TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;

		assertEquals(2, test.longestUnivaluePath(t1));
	}


}