package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC366_Find_Leaves_Of_Binary_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private int findHeightFromLeaf(TreeNode node, List<List<Integer>> res){
		if(node == null){
			return -1;
		}

		int heightFromLeafLeft = findHeightFromLeaf(node.left, res);
		int heightFromLeafRight = findHeightFromLeaf(node.right, res);
		int heightFromLeaf = Math.max(heightFromLeafLeft, heightFromLeafRight) + 1;
		if(res.size() < (heightFromLeaf +1)){
			res.add(new ArrayList<>());
		}
		res.get(heightFromLeaf).add(node.val);
		return heightFromLeaf;

	}

	public List<List<Integer>> findLeaves(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		findHeightFromLeaf(root, res);
		return res;
	}
}
