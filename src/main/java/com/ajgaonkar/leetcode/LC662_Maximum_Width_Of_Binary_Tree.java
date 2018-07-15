package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC662_Maximum_Width_Of_Binary_Tree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


	private void widthOfBinaryTree(TreeNode node, int level, int currentWidth, Map<Integer, List<Integer>> map) {
		if(node == null){
			return;
		}
		if (!map.containsKey(level)) {
			map.put(level, new ArrayList<>());
		}
		map.get(level).add(currentWidth);

		widthOfBinaryTree(node.left, level +1, ((2 * currentWidth) -1), map);
		widthOfBinaryTree(node.right, level +1, (2 * currentWidth), map);
	}

	public int widthOfBinaryTree(TreeNode root) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		widthOfBinaryTree(root, 0, 1, map);
		int max = Integer.MIN_VALUE;
		for(Integer key : map.keySet()){
			List<Integer> lst = map.get(key);
			Collections.sort(lst);
			if(lst.size() < 1){
				continue;
			}

			int newMax = lst.get(lst.size() -1) - lst.get(0) +1;
			max = Math.max(max, newMax);
		}
		return max;
	}
}
