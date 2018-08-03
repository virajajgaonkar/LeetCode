package com.ajgaonkar.leetcode;

public class LC705_Design_Hashset_2 {
	int numOfBuckets = 1001;
	int itemsPerBucket = 1000;
	boolean[][] arr = new boolean[numOfBuckets][itemsPerBucket];
	/** Initialize your data structure here. */
	public LC705_Design_Hashset_2() {

	}

	private int getBucket(int key){
		return key /itemsPerBucket;
	}
	private int getItemInBucket(int key){
		return key %itemsPerBucket;
	}
	public void add(int key) {
		arr[getBucket(key)][getItemInBucket(key)] = true;
	}

	public void remove(int key) {
		arr[getBucket(key)][getItemInBucket(key)] = false;
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		return arr[getBucket(key)][getItemInBucket(key)];
	}
}
