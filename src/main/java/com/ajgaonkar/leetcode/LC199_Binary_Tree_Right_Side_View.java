package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC199_Binary_Tree_Right_Side_View {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public void rightSideView(TreeNode node, int level, Map<Integer, Integer> res) {
		if(node == null){
			return;
		}
		rightSideView(node.left, level +1, res);
		res.put(level, node.val);
		rightSideView(node.right, level +1, res);
	}

	public List<Integer> rightSideView(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();
		rightSideView(root, 0, map);

		List<Integer> res = new ArrayList<>(map.size());
		for (Integer key : map.keySet()){
			res.add(key, map.get(key));
		}
		return res;
	}
}
