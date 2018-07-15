package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC366_Find_Leaves_Of_Binary_TreeTest {
	LC366_Find_Leaves_Of_Binary_Tree test = new LC366_Find_Leaves_Of_Binary_Tree();
	@Test
	public void test(){
		LC366_Find_Leaves_Of_Binary_Tree.TreeNode t1 = new LC366_Find_Leaves_Of_Binary_Tree.TreeNode(1);
		LC366_Find_Leaves_Of_Binary_Tree.TreeNode t2 = new LC366_Find_Leaves_Of_Binary_Tree.TreeNode(2);
		LC366_Find_Leaves_Of_Binary_Tree.TreeNode t3 = new LC366_Find_Leaves_Of_Binary_Tree.TreeNode(3);
		LC366_Find_Leaves_Of_Binary_Tree.TreeNode t4 = new LC366_Find_Leaves_Of_Binary_Tree.TreeNode(4);
		LC366_Find_Leaves_Of_Binary_Tree.TreeNode t5 = new LC366_Find_Leaves_Of_Binary_Tree.TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;

		List<List<Integer>> res = test.findLeaves(t1);
		assertEquals(3, res.size());
		assertEquals(res.get(0), Arrays.asList(4,5,3));
		assertEquals(res.get(1), Arrays.asList(2));
		assertEquals(res.get(2), Arrays.asList(1));
	}
}