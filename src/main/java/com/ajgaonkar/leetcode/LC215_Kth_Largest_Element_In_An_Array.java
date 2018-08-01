package com.ajgaonkar.leetcode;

import java.util.Random;

/*
Option 1: Sort Array, return [N - k], O(N lg N) running time + O(1) memory
Option 2: Priority Queue of length K, O(N lg K) running time + O(K) memory
Option 3: QuickSort, O(N) best case / O(N^2) worst case running time + O(1) memory
Option 4: Shuffle + QuickSort, O(N) guaranteed running time + O(1) space
 */
public class LC215_Kth_Largest_Element_In_An_Array {
	public int findKthLargest(int[] nums, int k) {
		shuffle(nums);
		k = nums.length - k;
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			final int j = partition(nums, lo, hi);
			if(j < k) {
				lo = j + 1;
			} else if (j > k) {
				hi = j - 1;
			} else {
				break;
			}
		}
		return nums[k];
	}

	private void shuffle(int a[]) {
		final Random random = new Random();
		for(int ind = 1; ind < a.length; ind++) {
			final int r = random.nextInt(ind + 1);
			swap(a, ind, r);
		}
	}

	private int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while(true) {
			while(i < hi && less(a[++i], a[lo]));
			while(j > lo && less(a[lo], a[--j]));
			if(i >= j) {
				break;
			}
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}

	private void swap(int[] a, int i, int j) {
		final int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private boolean less(int v, int w) {
		return v < w;
	}
}
