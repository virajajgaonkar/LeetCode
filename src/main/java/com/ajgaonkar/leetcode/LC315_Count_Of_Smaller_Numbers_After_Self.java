package com.ajgaonkar.leetcode;

import java.util.Arrays;
import java.util.List;

public class LC315_Count_Of_Smaller_Numbers_After_Self {
	public static final class Node{
		private final int val;
		private int count;
		public int dup =1;
		public Node left;
		public Node right;

		public Node(int val, int count) {
			this.val = val;
			this.count = count;
		}
	}

	private Node insert(int num, int i, Integer[] ans, Node node, int count){
		if(node == null){
			node = new Node(num, 0);
			ans[i] = count;
		} else if(node.val == num){
			node.dup++;
			ans[i] = count + node.count;
		} else if (node.val > num){
			node.count++;
			node.left = insert(num,i, ans, node.left, count);
		} else {
			node.right = insert(num,i, ans, node.right, count + node.count + node.dup);
		}
		return node;
	}

	public List<Integer> countSmaller(int[] nums) {
		Node root = null;
		Integer[] ans = new Integer[nums.length];
		for(int i= nums.length-1; i>=0; i--){
			root = insert(nums[i], i, ans, root, 0);
		}
		return Arrays.asList(ans);
	}
}
