package com.ajgaonkar.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC295_Find_Median_From_Data_Stream {
	// max queue is always larger or equal to min queue
	PriorityQueue<Integer> min = new PriorityQueue();
	PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());

	//Insertion/Add is O(Log(n))
	// Adds a number into the data structure.
	public void addNum(int num) {
		max.offer(num);
		min.offer(max.poll());
		if (max.size() < min.size()){
			max.offer(min.poll());
		}
	}

	//Query/Get/find is O(1)
	// Returns the median of current data stream
	public double findMedian() {
		if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
		else return max.peek();
	}
}
