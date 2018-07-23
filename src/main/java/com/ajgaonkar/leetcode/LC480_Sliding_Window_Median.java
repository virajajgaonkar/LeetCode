package com.ajgaonkar.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LC480_Sliding_Window_Median {
	Queue<Integer> minHeap = new PriorityQueue<>();
	Queue<Integer> maxHeap = new PriorityQueue<>(1, Collections.reverseOrder());

	public double[] medianSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		double[] medians = new double[n - k + 1];

		//Total Complexity is O(n^2)
		for(int i = 0; i < nums.length; ++i) {
			//Each is O(Log(n))
			addNum(nums[i]);
			if (i - k >= 0) {
				//Each is O(n)
				removeNum(nums[i - k]);
			}
			if (i - k + 1 >=0) {
				medians[i- k + 1] = getMedian();
			}
		}

		return medians;
	}

	private void addNum(int n) {
		if (minHeap.isEmpty()) {
			minHeap.offer(n);
			return;
		} else if (minHeap.peek() <= n) {
			minHeap.offer(n);
		} else {
			maxHeap.offer(n);
		}
		rebalance();
	}

	private void removeNum(int n) {
		if (minHeap.peek() <= n) {
			minHeap.remove(n);
		} else {
			maxHeap.remove(n);
		}
		rebalance();
	}

	private void rebalance() {
		if (minHeap.size() - maxHeap.size() > 1) {
			maxHeap.offer(minHeap.poll());
		} else if (maxHeap.size() > minHeap.size()) {
			minHeap.offer(maxHeap.poll());
		}
	}

	private double getMedian() {
		return minHeap.size() == maxHeap.size() ? ((double)minHeap.peek() + maxHeap.peek()) / 2 : minHeap.peek();
	}
}
