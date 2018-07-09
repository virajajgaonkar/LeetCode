package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC250_Count_Univalue_SubtreesTest {
	LC250_Count_Univalue_Subtrees test = new LC250_Count_Univalue_Subtrees();
	@Test
	public void test(){
		LC250_Count_Univalue_Subtrees.TreeNode t1 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t2 = new LC250_Count_Univalue_Subtrees.TreeNode(1);
		LC250_Count_Univalue_Subtrees.TreeNode t3 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t4 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t5 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t6 = new LC250_Count_Univalue_Subtrees.TreeNode(5);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		assertEquals(4, test.countUnivalSubtrees(t1));
	}

	@Test
	public void test2(){
		LC250_Count_Univalue_Subtrees.TreeNode t1 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t2 = new LC250_Count_Univalue_Subtrees.TreeNode(5);
		LC250_Count_Univalue_Subtrees.TreeNode t3 = new LC250_Count_Univalue_Subtrees.TreeNode(1);

		t1.left = t2;
		t1.right = t3;
		assertEquals(2, test.countUnivalSubtrees(t1));
	}
}