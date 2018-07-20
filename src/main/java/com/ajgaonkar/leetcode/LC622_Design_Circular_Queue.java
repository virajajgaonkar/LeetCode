package com.ajgaonkar.leetcode;

public class LC622_Design_Circular_Queue {
	private final int[] arr;
	private int front = -1;
	private int rear = -1;
	private int length = 0;

	/** Initialize your data structure here. Set the size of the queue to be k. */
	public LC622_Design_Circular_Queue(int k) {
		arr = new int[k];
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(isFull()){
			return false;
		}


		if(front == -1){
			front++;
		}
		rear = (rear+1)%arr.length;
		length++;
		arr[rear] = value;
		return true;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(isEmpty()){
			return false;
		}
		front = (front+1)%arr.length;
		length--;
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if(isEmpty()){
			return -1;
		}
		return arr[front];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isEmpty()){
			return -1;
		}
		return arr[rear];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return (length == 0);
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return (length == arr.length);
	}
}
