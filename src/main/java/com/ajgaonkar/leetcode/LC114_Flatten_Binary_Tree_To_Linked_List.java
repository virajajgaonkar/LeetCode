package com.ajgaonkar.leetcode;

import java.util.Stack;

//ToDo: Redo
public class LC114_Flatten_Binary_Tree_To_Linked_List {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private void populateStack(TreeNode node, Stack<TreeNode> stack) {
		if (node == null) {
			return;
		}
		stack.push(node);
		populateStack(node.left, stack);
		populateStack(node.right, stack);
	}

	public void flatten(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		populateStack(root, stack);
		TreeNode past = null;
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop();
			if (past != null) {
				current.right = past;
				current.left = null;
			}
			past = current;
		}
		return;
	}
}
