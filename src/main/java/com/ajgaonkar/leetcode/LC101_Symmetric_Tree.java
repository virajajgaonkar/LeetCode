package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC101_Symmetric_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	private boolean isSymmetricR(TreeNode ln, TreeNode rn) {
		if ((ln == null) && (rn == null)){
			return true;
		} else if ((ln == null) || (rn == null)){
			return false;
		}
		return (ln.val == rn.val)
				&& isSymmetricR(ln.left, rn.right)
				&& isSymmetricR(ln.right, rn.left);
	}

	public boolean isSymmetric(TreeNode root) {
		return isSymmetricR(root, root);
	}
}
