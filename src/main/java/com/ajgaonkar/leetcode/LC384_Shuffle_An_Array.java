package com.ajgaonkar.leetcode;

import java.util.Random;

//ToDo: Redo
public class LC384_Shuffle_An_Array {
	private final int[] ori;
	private final int[] arr;
	private final Random rand = new Random(System.currentTimeMillis());

	public LC384_Shuffle_An_Array(int[] nums) {
		if(nums != null){
			ori = new int[nums.length];
			arr = new int[nums.length];
			for(int i=0; i< nums.length; i++){
				ori[i] = nums[i];
				arr[i] = nums[i];
			}
		} else {
			ori = null;
			arr = null;
		}
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		if(arr == null){
			return arr;
		}
		for(int i =0; i< ori.length; i++){
			arr[i] = ori[i];
		}
		return arr;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		if(arr == null){
			return arr;
		}
		for(int i =0; i< arr.length; i++){
			int next = rand.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[next];
			arr[next] = temp;
		}
		return arr;
	}
}
