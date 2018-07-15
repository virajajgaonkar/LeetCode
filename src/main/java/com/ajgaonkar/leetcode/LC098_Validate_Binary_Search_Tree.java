package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC098_Validate_Binary_Search_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode current, Integer lowerBound, Integer upperBound) {
		if(current == null){
			return true;
		}

		boolean c1 = (lowerBound == null) ? true : (current.val > lowerBound);
		boolean c2 = (upperBound == null) ? true : (current.val < upperBound);
		boolean c3 = isValidBST(current.left, lowerBound, current.val);
		boolean c4 = isValidBST(current.right, current.val, upperBound);
		return c1 && c2 && c3 && c4;
	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}
}
