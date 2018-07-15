package com.ajgaonkar.leetcode;

public class LC654_Maximum_Binary_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private int findIndexOfMax(int[] nums, int low, int high){
		int indexOfMax = low;
		int max = Integer.MIN_VALUE;
		for (int i = low; i<= high; ++i){
			if(nums[i] > max){
				indexOfMax = i;
				max = nums[i];
			}
		}
		return indexOfMax;
	}
	private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
		if(start > end){
			return null;
		}
		int indexOfMax = findIndexOfMax(nums, start, end);
		TreeNode node = new TreeNode(nums[indexOfMax]);
		node.left = constructMaximumBinaryTree(nums, start, (indexOfMax-1));
		node.right = constructMaximumBinaryTree(nums, (indexOfMax+1), end);
		return node;
	}
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		TreeNode root = constructMaximumBinaryTree(nums, 0, nums.length -1);
		return root;
	}
}
