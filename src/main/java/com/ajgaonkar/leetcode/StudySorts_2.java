package com.ajgaonkar.leetcode;

public class StudySorts_2 {
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static int partition(int[] arr, int lo, int hi, int pivot){
		while(lo <= hi){
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
	private static void quickSort(int[] arr, int lo, int hi){
		if(lo < hi){
			int pivot = arr[(lo + hi)/2];
			int index = partition(arr, lo, hi, pivot);
			quickSort(arr, lo, index-1);
			quickSort(arr, index, hi);
		}
	}
	public static void quickSort(int[] arr){
		quickSort(arr, 0, arr.length -1);
	}
}
