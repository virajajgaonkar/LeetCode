package com.ajgaonkar.leetcode;

import java.util.PriorityQueue;

/*
Simple. Use PriorityQueue.
Keep top k elements in PriorityQueue sorted in Ascending Order.
Input Array & next inputs are unsorted.
 */
public class LC703_Kth_Largest_Element_In_A_Stream {
	private final PriorityQueue<Integer> q = new PriorityQueue<>(); //6, 7, 8, 9, 10
	private final int k;
	public LC703_Kth_Largest_Element_In_A_Stream(int k, int[] nums) {
		this.k = k;
		for(int current : nums){
			q.offer(current);
			if(q.size() > k){
				q.poll();
			}
		}
	}

	public int add(int val) {
		if((q.size() < k) || (val > q.peek())){
			q.offer(val);
		}
		if(q.size() > k){
			q.poll();
		}
		return q.peek();
	}
}
