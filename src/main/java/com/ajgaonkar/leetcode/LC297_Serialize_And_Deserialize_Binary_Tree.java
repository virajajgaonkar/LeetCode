package com.ajgaonkar.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC297_Serialize_And_Deserialize_Binary_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private void serialize(TreeNode c, StringBuilder sb){
		if(c == null){
			sb.append("null");
			sb.append(",");
			return;
		}
		sb.append(c.val);
		sb.append(",");
		serialize(c.left, sb);
		serialize(c.right, sb);
	}


	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		serialize(root, sb);
		return sb.toString();
	}

	private TreeNode deserialize(Stack<String> st){
		if(st.isEmpty()){
			return null;
		}
		String s = st.pop();
		if("null".equals(s)){
			return null;
		}
		TreeNode n = new TreeNode(Integer.parseInt(s));
		n.left = deserialize(st);
		n.right = deserialize(st);
		return n;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if((data == null) || (data.length() ==0)){
			return null;
		}
		String[] parts = data.split(",");
		Stack<String> s = new Stack<>();
		for(int i= parts.length-1; i>=0; i--){
			s.push(parts[i]);
		}
		return deserialize(s);
	}

	public boolean equals(TreeNode t1, TreeNode t2){
		if((t1 == null) && (t2 == null)){
			return true;
		}
		if((t1 == null) || (t2 == null)){
			return false;
		}

		return (t1.val == t2.val) &&
				equals(t1.left, t2.left) &&
				equals(t1.right, t2.right);
	}
}
