package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC222_Count_Complete_Tree_NodesTest {
	LC222_Count_Complete_Tree_Nodes test = new LC222_Count_Complete_Tree_Nodes();
	@Test
	public void test(){
		LC222_Count_Complete_Tree_Nodes.TreeNode t1 = new LC222_Count_Complete_Tree_Nodes.TreeNode(1);
		LC222_Count_Complete_Tree_Nodes.TreeNode t2 = new LC222_Count_Complete_Tree_Nodes.TreeNode(2);
		LC222_Count_Complete_Tree_Nodes.TreeNode t3 = new LC222_Count_Complete_Tree_Nodes.TreeNode(3);
		LC222_Count_Complete_Tree_Nodes.TreeNode t4 = new LC222_Count_Complete_Tree_Nodes.TreeNode(4);
		LC222_Count_Complete_Tree_Nodes.TreeNode t5 = new LC222_Count_Complete_Tree_Nodes.TreeNode(5);
		LC222_Count_Complete_Tree_Nodes.TreeNode t6 = new LC222_Count_Complete_Tree_Nodes.TreeNode(6);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;

		assertEquals(6, test.countNodes(t1));
	}

}