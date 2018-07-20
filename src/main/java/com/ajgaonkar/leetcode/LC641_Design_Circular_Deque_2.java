package com.ajgaonkar.leetcode;

public class LC641_Design_Circular_Deque_2 {
	private int[] arr;
	private int front = -1;
	private int last = -1;
	private int length = 0;

	/** Initialize your data structure here. Set the size of the deque to be k. */
	public LC641_Design_Circular_Deque_2(int k) {
		this.arr = new int[k];
	}

	/** Adds an item at the front of Deque. Return true if the operation is successful. */
	public boolean insertFront(int value) {
		if(isFull()){
			return false;
		}
		if(isEmpty()){
			front = 0;
			last = 0;
		} else {
			front = ((front -1) >= 0) ? (front -1) : (arr.length -1);
		}
		arr[front] = value;
		length++;
		return true;
	}

	/** Adds an item at the rear of Deque. Return true if the operation is successful. */
	public boolean insertLast(int value) {
		if(isFull()){
			return false;
		}
		if(isEmpty()){
			front = 0;
			last = 0;
		} else {
			last = (last + 1) % arr.length;
		}
		arr[last] = value;
		length++;
		return true;
	}

	/** Deletes an item from the front of Deque. Return true if the operation is successful. */
	public boolean deleteFront() {
		if(isEmpty()){
			return false;
		}
		length--;
		if(length == 0){
			front = 0;
			last = 0;
		} else {
			front = (front +1) % arr.length;
		}

		return true;
	}

	/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
	public boolean deleteLast() {
		if(isEmpty()){
			return false;
		}
		length--;
		if(isEmpty()){
			last = 0;
		} else {
			last = ((last - 1) >=0 ) ? (last -1) : (arr.length -1);
		}

		return true;
	}

	/** Get the front item from the deque. */
	public int getFront() {
		if(isEmpty()){
			return -1;
		}
		return arr[front];
	}

	/** Get the last item from the deque. */
	public int getRear() {
		if(isEmpty()){
			return -1;
		}
		return arr[last];
	}

	/** Checks whether the circular deque is empty or not. */
	public boolean isEmpty() {
		return (length == 0);
	}

	/** Checks whether the circular deque is full or not. */
	public boolean isFull() {
		return (length == arr.length);
	}
}
