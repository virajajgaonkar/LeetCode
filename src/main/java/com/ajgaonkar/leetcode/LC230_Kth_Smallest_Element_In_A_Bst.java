package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

//ToDo: Redo
public class LC230_Kth_Smallest_Element_In_A_Bst {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private int kthSmallest(TreeNode root, int k, List<Integer> result) {
		if(root == null){
			return -1;
		}
		int res = -1;
		res = kthSmallest(root.left, k , result);
		if(res != -1){
			return res;
		}
		result.add(root.val);
		if(result.size() == k){
			return root.val;
		}
		res = kthSmallest(root.right, k , result);
		if(res != -1){
			return res;
		}
		return -1;
	}
	public int kthSmallest(TreeNode root, int k) {
		return kthSmallest(root, k, new ArrayList<>());
	}
}
