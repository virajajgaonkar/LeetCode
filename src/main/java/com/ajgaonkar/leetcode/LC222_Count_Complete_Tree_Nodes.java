package com.ajgaonkar.leetcode;

public class LC222_Count_Complete_Tree_Nodes {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private int rightDepth(TreeNode right){
		int depth = 0;
		while (right != null){
			depth++;
			right = right.right;
		}
		return depth;
	}

	private int leftDepth(TreeNode left){
		int depth = 0;
		while (left != null){
			depth++;
			left = left.left;
		}
		return depth;
	}

	public int countNodes(TreeNode root) {
		if(root == null){
			return 0;
		}
		int leftDepth = leftDepth(root);
		int rightDepth = rightDepth(root);

		if(leftDepth == rightDepth){
			return (1 << leftDepth) -1;
		} else {
			return 1 + countNodes(root.left) + countNodes(root.right);
		}
	}
}
