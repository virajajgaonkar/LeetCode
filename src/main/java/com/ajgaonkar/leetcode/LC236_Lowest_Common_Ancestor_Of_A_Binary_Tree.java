package com.ajgaonkar.leetcode;

public class LC236_Lowest_Common_Ancestor_Of_A_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if((root ==null) || (root.val == p.val) || (root.val == q.val)){
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		return (left == null) ? right : (right == null) ? left : root;
	}
}
