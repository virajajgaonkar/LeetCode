package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC102_Binary_Tree_Level_Order_TraversalTest {
	LC102_Binary_Tree_Level_Order_Traversal test = new LC102_Binary_Tree_Level_Order_Traversal();
//	   3
//			   / \
//			   9  20
//			   /  \
//			   15   7
//			   return its level order traversal as:
//			[
//			[3],
//			[9,20],
//			[15,7]
//			]
	@Test
	public void test(){
		LC102_Binary_Tree_Level_Order_Traversal.TreeNode t1 = new LC102_Binary_Tree_Level_Order_Traversal.TreeNode(3);
		LC102_Binary_Tree_Level_Order_Traversal.TreeNode t2 = new LC102_Binary_Tree_Level_Order_Traversal.TreeNode(9);
		LC102_Binary_Tree_Level_Order_Traversal.TreeNode t3 = new LC102_Binary_Tree_Level_Order_Traversal.TreeNode(20);
		LC102_Binary_Tree_Level_Order_Traversal.TreeNode t4 = new LC102_Binary_Tree_Level_Order_Traversal.TreeNode(15);
		LC102_Binary_Tree_Level_Order_Traversal.TreeNode t5 = new LC102_Binary_Tree_Level_Order_Traversal.TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));
		List<List<Integer>> actual = test.levelOrder(t1);
		assertEquals(expected, actual);
	}
}