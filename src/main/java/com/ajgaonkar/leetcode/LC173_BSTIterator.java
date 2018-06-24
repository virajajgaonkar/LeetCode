package com.ajgaonkar.leetcode;

import java.util.List;
import java.util.Stack;

public class LC173_BSTIterator {
	public static final class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


	private final Stack<TreeNode> stack = new Stack<TreeNode>();

	public LC173_BSTIterator(TreeNode root) {
		populate(root, stack);
	}

	private void populate(TreeNode current, Stack<TreeNode> stack){
		if(current == null){
			return;
		}
		stack.push(current);
		populate(current.left, stack);
	}

	/**
	 * @return whether we have a next smallest number
	 */
	public boolean hasNext() {
		return !stack.empty();
	}

	/**
	 * @return the next smallest number
	 */
	public int next() {
		TreeNode n = stack.pop();
		populate(n.right, stack);
		return n.val;
	}
}
