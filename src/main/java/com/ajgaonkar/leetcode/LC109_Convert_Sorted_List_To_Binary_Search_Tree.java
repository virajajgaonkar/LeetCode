package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

//ToDo: Redo
public class LC109_Convert_Sorted_List_To_Binary_Search_Tree {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	private void convertToArrayList(ListNode head, List<ListNode> lst){
		ListNode current = head;
		while (current != null){
			lst.add(current);
			current = current.next;
		}
	}
	private TreeNode insertInTree(TreeNode root, int v){
		if(root == null){
			return new TreeNode(v);
		} else if(v < root.val){
			if(root.left == null){
				root.left = new TreeNode(v);
			} else {
				insertInTree(root.left, v);
			}
		} else {
			if(root.right == null){
				root.right = new TreeNode(v);
			} else {
				insertInTree(root.right, v);
			}
		}
		return root;
	}
	private TreeNode insertAllInTree(List<ListNode> lst, int start, int end){
		if(start > end){
			return null;
		}
		int mid = (start + end +1) /2;
		TreeNode node = new TreeNode(lst.get(mid).val);
		node.left = insertAllInTree(lst, start, mid -1);
		node.right = insertAllInTree(lst, mid +1, end);
		return node;
	}
	public TreeNode sortedListToBST(ListNode head) {
		List<ListNode> lst = new ArrayList<>();
		convertToArrayList(head, lst);
		return insertAllInTree(lst, 0, lst.size() -1);
	}
}
