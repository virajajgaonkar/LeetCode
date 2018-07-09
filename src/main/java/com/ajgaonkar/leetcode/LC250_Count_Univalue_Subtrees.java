package com.ajgaonkar.leetcode;

public class LC250_Count_Univalue_Subtrees {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int countUnivalSubtrees(TreeNode root) {
		int[] count = new int[1];
		countUnivalSubtrees(root, count);
		return count[0];
	}

	private boolean countUnivalSubtrees(TreeNode node, int[] count){
		if(node == null){
			return true;
		}
		boolean left = countUnivalSubtrees(node.left, count);
		boolean right = countUnivalSubtrees(node.right, count);
		if(!(left && right)){
			return false;
		}
		if((node.left != null) && (node.left.val != node.val)){
			return false;
		}
		if((node.right != null) && (node.right.val != node.val)){
			return false;
		}
		count[0]++;
		return true;
	}
}
