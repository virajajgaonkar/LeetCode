package com.ajgaonkar.leetcode;

public class LC572_Subtree_Of_Another_Tree_2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	private boolean areSameTrees(TreeNode s, TreeNode t){
		if((s == null) && (t == null)){
			return true;
		}
		if((s == null) || (t == null)){
			return false;
		}
		return ((s.val == t.val) && areSameTrees(s.left, t.left) && areSameTrees(s.right, t.right));
	}
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if((s == null) && (t == null)){
			return true;
		}
		if((s == null) || (t == null)){
			return false;
		}
		if(s.val == t.val){
			if(areSameTrees(s, t)){
				return true;
			}
		}
		if(isSubtree(s.left, t)){
			return true;
		}
		if(isSubtree(s.right, t)){
			return true;
		}
		return false;
	}
}
