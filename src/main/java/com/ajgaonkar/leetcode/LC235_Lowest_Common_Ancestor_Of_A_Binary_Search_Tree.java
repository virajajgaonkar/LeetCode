package com.ajgaonkar.leetcode;

public class LC235_Lowest_Common_Ancestor_Of_A_Binary_Search_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if((root.val < p.val) && (root.val < q.val)){
			return lowestCommonAncestor(root.right, p, q);
		} else if ((root.val > p.val) && (root.val > q.val)){
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}
	}
}
