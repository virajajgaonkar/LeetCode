package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC173_BSTIteratorTest {
	@Test
	public void test(){
		LC173_BSTIterator.TreeNode t1 = new LC173_BSTIterator.TreeNode(1);
		LC173_BSTIterator.TreeNode t2 = new LC173_BSTIterator.TreeNode(2);
		LC173_BSTIterator.TreeNode t3 = new LC173_BSTIterator.TreeNode(3);
		LC173_BSTIterator.TreeNode t4 = new LC173_BSTIterator.TreeNode(4);
		LC173_BSTIterator.TreeNode t5 = new LC173_BSTIterator.TreeNode(5);
		LC173_BSTIterator.TreeNode t6 = new LC173_BSTIterator.TreeNode(6);
		LC173_BSTIterator.TreeNode t7 = new LC173_BSTIterator.TreeNode(7);
		t2.left = t1;
		t2.right = t3;
		t4.left = t2;
		t4.right = t6;
		t6.left = t5;
		t6.right = t7;

		LC173_BSTIterator test = new LC173_BSTIterator(t4);
		for(int i= 1; i<=7 ; i++){
			assertEquals(true, test.hasNext());
			assertEquals(i, test.next());
		}
		assertEquals(false, test.hasNext());
	}

}