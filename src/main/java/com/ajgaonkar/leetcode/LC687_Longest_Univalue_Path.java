package com.ajgaonkar.leetcode;

public class LC687_Longest_Univalue_Path {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private int longestUnivaluePath(TreeNode node, int[] count){
		if(node == null){
			return 0;
		}
		int left = (node.left == null)?0: longestUnivaluePath(node.left, count);
		int right = (node.right == null)?0: longestUnivaluePath(node.right, count);
		int resL = 0;
		if ((node.left != null) && (node.left.val == node.val)){
			resL = left +1;
		}
		int resR = 0;
		if ((node.right != null) && (node.right.val == node.val)){
			resR = right +1;
		}
		count[0] = Math.max(count[0], resL + resR);
		return Math.max(resL, resR);
	}


	public int longestUnivaluePath(TreeNode root) {
		int[] count = new int[1];
		longestUnivaluePath(root, count);
		return count[0];
	}
}
