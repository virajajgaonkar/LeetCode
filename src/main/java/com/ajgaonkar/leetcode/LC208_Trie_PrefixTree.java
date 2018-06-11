package com.ajgaonkar.leetcode;

import javax.swing.tree.TreeNode;

public class LC208_Trie_PrefixTree {
	public static final class TrieNode {
		public final Character c;
		public final TrieNode[] nodes;
		private boolean end;


		public TrieNode(Character c) {
			this.c = c;
			this.nodes = new TrieNode[26];
		}
	}

	private final TrieNode root;

	/** Initialize your data structure here. */
	public LC208_Trie_PrefixTree() {
		root = new TrieNode(' ');
	}

	private void insert(char[] input, int i, TrieNode node){
		Character current = input[i];
		int index = current -'a';
		if(node.nodes[index] == null){
			node.nodes[index] = new TrieNode(current);
		}
		if(i == input.length -1){
			node.nodes[index].end = true;
		} else {
			insert(input, i+1, node.nodes[index]);
		}
		return;
	}
	/** Inserts a word into the trie. */
	public void insert(String word) {
		insert(word.toCharArray(), 0, root);
	}

	private boolean search(char[] input, int i, TrieNode node){
		Character c = input[i];
		int index = c - 'a';
		if(node.nodes[index] == null){
			return false;
		}
		if(i == input.length -1){
			return node.nodes[index].end;
		} else {
			return search(input, i+1, node.nodes[index]);
		}
	}
	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		return search(word.toCharArray(), 0, root);
	}

	private boolean ateastOneChild(TrieNode node){
		if(node == null){
			return false;
		}
		if(node.nodes == null){
			return false;
		}
		for(TrieNode c : node.nodes){
			if(c != null){
				return true;
			}
		}
		return false;
	}
	private boolean startsWith(char[] input, int i, TrieNode node){
		Character c = input[i];
		int index = c - 'a';
		if(node.nodes[index] == null){
			return false;
		}
		if(i == input.length -1){
			return ateastOneChild(node); //node.nodes[index] != null;
		} else {
			return startsWith(input, i+1, node.nodes[index]);
		}
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		return startsWith(prefix.toCharArray(), 0, root);
	}
}
