package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ToDo: Redo
public class LC116_Populating_Next_Right_Pointers_In_Each_Node {
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	private void convert(TreeLinkNode root, int level, Map<Integer, List<TreeLinkNode>> lst) {
		if (root == null) {
			return;
		}
		if (!lst.containsKey(level)) {
			lst.put(level, new ArrayList<>());
		}
		List<TreeLinkNode> current = lst.get(level);
		current.add(root);
		convert(root.left, level + 1, lst);
		convert(root.right, level + 1, lst);
	}

	public void connect(TreeLinkNode root) {
		Map<Integer, List<TreeLinkNode>> lst = new HashMap<>();
		convert(root, 0, lst);
		for (int i = 0; i < lst.size(); ++i) {
			if (!lst.containsKey(i)) {
				break;
			}
			List<TreeLinkNode> cur = lst.get(i);
			int len = cur.size();
			TreeLinkNode past = null;
			for (int j = len - 1; j >= 0; --j) {
				TreeLinkNode current = cur.get(j);
				current.next = past;
				past = current;
			}
		}
	}
}
