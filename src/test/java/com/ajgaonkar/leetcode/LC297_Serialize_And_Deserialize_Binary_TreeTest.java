package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC297_Serialize_And_Deserialize_Binary_TreeTest {
	LC297_Serialize_And_Deserialize_Binary_Tree test = new LC297_Serialize_And_Deserialize_Binary_Tree();
	@Test
	public void test(){
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode t1 = new LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode(1);
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode t2 = new LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode(2);
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode t3 = new LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode(3);
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode t4 = new LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode(4);
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode t5 = new LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		String serialized = test.serialize(t1);
		assertNotNull(serialized);
		LC297_Serialize_And_Deserialize_Binary_Tree.TreeNode d = test.deserialize(serialized);
		assertNotNull(d);
		assertEquals(true, test.equals(t1, d));
	}

}