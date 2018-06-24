package com.ajgaonkar.leetcode;

public class LC362_Design_Hit_Counter {
	private final static int COUNT = 5 * 60;
	private final int[] timestamps;
	private final int[] counts;

	/** Initialize your data structure here. */
	public LC362_Design_Hit_Counter() {
		timestamps = new int[COUNT];
		counts = new int[COUNT];
	}

	/** Record a hit.
	 @param timestamp - The current timestamp (in seconds granularity). */
	public void hit(int timestamp) {
		int index = (timestamp -1) % COUNT;
		if(timestamps[index] != timestamp){
			timestamps[index] = timestamp;
			counts[index] = 1;
		} else {
			counts[index] = counts[index] + 1;
		}
	}

	/** Return the number of hits in the past 5 minutes.
	 @param timestamp - The current timestamp (in seconds granularity). */
	public int getHits(int timestamp) {
		int sum = 0;
		for (int i =0; i< COUNT; i ++){
			if(timestamp - timestamps[i] < COUNT){
				sum = sum + counts[i];
			}
		}
		return sum;
	}
}
