package com.ajgaonkar.leetcode;

public class LC705_Design_Hashset {
	private final boolean[] arr = new boolean[1000001];
	/** Initialize your data structure here. */
	public LC705_Design_Hashset() {
	}

	private int hash(int i) {
		return i;
	}

	public void add(int key) {
		arr[hash(key)] = true;
	}

	public void remove(int key) {
		arr[hash(key)] = false;

	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		return arr[hash(key)];
	}
}
