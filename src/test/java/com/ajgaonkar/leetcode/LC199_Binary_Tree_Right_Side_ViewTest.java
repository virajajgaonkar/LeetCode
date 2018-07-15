package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC199_Binary_Tree_Right_Side_ViewTest {
	LC199_Binary_Tree_Right_Side_View test = new LC199_Binary_Tree_Right_Side_View();

	@Test
	public void test(){
		LC199_Binary_Tree_Right_Side_View.TreeNode t1 = new LC199_Binary_Tree_Right_Side_View.TreeNode(1);
		LC199_Binary_Tree_Right_Side_View.TreeNode t2 = new LC199_Binary_Tree_Right_Side_View.TreeNode(2);
		LC199_Binary_Tree_Right_Side_View.TreeNode t3 = new LC199_Binary_Tree_Right_Side_View.TreeNode(3);
		LC199_Binary_Tree_Right_Side_View.TreeNode t4 = new LC199_Binary_Tree_Right_Side_View.TreeNode(5);
		LC199_Binary_Tree_Right_Side_View.TreeNode t5 = new LC199_Binary_Tree_Right_Side_View.TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		t3.right = t5;

		assertEquals(Arrays.asList(1,3,4), test.rightSideView(t1));
	}
}