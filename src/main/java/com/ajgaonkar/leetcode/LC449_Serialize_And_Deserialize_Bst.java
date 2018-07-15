package com.ajgaonkar.leetcode;

import java.util.ArrayList;

//ToDo: Redo
public class LC449_Serialize_And_Deserialize_Bst {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private void insertInternal(TreeNode node, int v){
		if(node.val > v){
			if(node.left == null){
				node.left = new TreeNode(v);
			} else {
				insert(node.left, v);
			}
		} else {
			if(node.right == null){
				node.right = new TreeNode(v);
			} else {
				insert(node.right, v);
			}
		}
	}

	public TreeNode insert(TreeNode root, int v){
		if(root == null){
			return new TreeNode(v);
		}
		insertInternal(root, v);
		return root;
	}

	public void preOrder(TreeNode node, ArrayList<Integer> lst){
		if(node == null){
			return;
		}
		lst.add(node.val);
		preOrder(node.left, lst);
		preOrder(node.right, lst);
	}

	public String listToString(ArrayList<Integer> lst){
		StringBuilder sb = new StringBuilder();
		if(lst.size() > 0){
			for(int i = 0; i < lst.size() -1; i++){
				sb.append(lst.get(i)).append(",");
			}
			sb.append(lst.get(lst.size() -1));
		}
		return sb.toString();
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		ArrayList<Integer> lst = new ArrayList<>();
		preOrder(root, lst);
		return listToString(lst);
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if( (data == null) || (data.trim().length() == 0)){
			return null;
		}
		String[] d = data.split(",");
		TreeNode root = null;
		for(int i = 0; i< d.length; i++){
			root = insert(root, Integer.valueOf(d[i]));
		}
		return root;
	}
}
