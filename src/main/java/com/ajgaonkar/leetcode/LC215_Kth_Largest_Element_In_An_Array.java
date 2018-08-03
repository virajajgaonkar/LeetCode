package com.ajgaonkar.leetcode;

import java.util.Random;

/*
Option 1: Sort Array, return [N - k], O(N lg N) running time + O(1) memory
Option 2: Priority Queue of length K, O(N lg K) running time + O(K) memory
Option 3: QuickSort, O(N) best case / O(N^2) worst case running time + O(1) memory
Option 4: Shuffle + QuickSort, O(N) guaranteed running time + O(1) space
 */
public class LC215_Kth_Largest_Element_In_An_Array {
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private void shuffle(int[] arr){
		Random random = new Random();
		for(int i=0; i< arr.length; i++){
			int j = Math.abs(random.nextInt()) % arr.length;
			swap(arr, i, j);
		}
	}

	private int partition(int[] arr, int lo, int hi, int pivot){
		while (lo <= hi){
			while (arr[lo] < pivot){
				lo++;
			}
			while (arr[hi] > pivot){
				hi--;
			}
			if(lo <= hi){
				swap(arr, lo, hi);
				lo++;
				hi--;
			}
		}
		return lo;
	}

	private void quickSort(int[] arr, int lo, int hi){
		if(lo >= hi){
			return;
		}
		int pivot = arr[(lo + hi)/2];
		int index = partition(arr, lo, hi, pivot);
		quickSort(arr, lo, index-1);
		quickSort(arr, index, hi);
	}
	public int findKthLargest(int[] nums, int k) {
		shuffle(nums);
		quickSort(nums, 0, nums.length-1);
		return nums[nums.length -k];
	}
}
