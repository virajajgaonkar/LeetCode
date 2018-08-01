package com.ajgaonkar.leetcode;

public class StudySorts {
	private static void swap(int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	private static int partition(int[] arr, int left, int right, int pivot){
		while (left <= right){
			while (arr[left] < pivot){
				left++;
			}
			while (arr[right] > pivot){
				right--;
			}
			if(left <= right){
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	private static void quickSort(int[] arr, int left, int right){
		if(left >= right){
			return;
		}
		int pivot = arr[(left + right)/2];
		int index = partition(arr, left, right, pivot);
		quickSort(arr, left, index-1);
		quickSort(arr, index, right);
	}
	public static void quickSort(int[] arr){
		quickSort(arr, 0, arr.length -1);
	}
}
