package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC572_Subtree_Of_Another_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private boolean areTreesSame(TreeNode s, TreeNode t){
		if((s == null) && (t == null)){
			return true;
		}
		if((s == null) || (t == null)){
			return false;
		}
		return ((s.val == t.val)
				&& (areTreesSame(s.left, t.left))
				&& (areTreesSame(s.right, t.right)));
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if((s== null) && (t == null)){
			return true;
		}
		if((s == null) || (t == null)){
			return false;
		}
		if((s.val == t.val)){
			if(areTreesSame(s, t)){
				return true;
			}
		}
		if(isSubtree(s.left,t)){
			return true;
		}
		if(isSubtree(s.right,t)){
			return true;
		}
		return false;
	}
}
