package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC102_Binary_Tree_Level_Order_Traversal {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


	private void levelOrder(TreeNode n, List<List<Integer>> res, int level){
		if(n == null){
			return;
		}
		if(res.size() < (level + 1)){
			res.add(new ArrayList<>());
		}
		res.get(level).add(n.val);
		if(n.left != null){
			levelOrder(n.left, res, level+1);
		}

		if(n.right != null){
			levelOrder(n.right, res, level+1);
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null){
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		levelOrder(root, result, 0);
		return result;
	}
}
