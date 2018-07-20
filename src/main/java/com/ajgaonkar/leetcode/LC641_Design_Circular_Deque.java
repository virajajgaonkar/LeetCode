package com.ajgaonkar.leetcode;

public class LC641_Design_Circular_Deque {
	public static class DoublyListNode {
		private final int val;
		private DoublyListNode prev;
		private DoublyListNode next;

		public DoublyListNode(int val) {
			this.val = val;
		}
	}
	public static class DoublyList{
		private final DoublyListNode head;
		private final DoublyListNode tail;
		private int length = 0;

		public DoublyList() {
			head = new DoublyListNode(0);
			tail = new DoublyListNode(0);
			head.next = tail;
			tail.prev = head;
			tail.next = head;
			head.prev = tail;
		}

		public boolean insertFront(int v){
			DoublyListNode n = new DoublyListNode(v);
			DoublyListNode next = head.next;

			head.next = n;
			n.prev = head;
			n.next = next;
			next.prev = n;
			length++;
			return true;
		}

		public boolean insertLast(int v){
			DoublyListNode prev = tail.prev;
			DoublyListNode n = new DoublyListNode(v);

			prev.next = n;
			n.prev = prev;
			n.next = tail;
			tail.prev = n;
			length++;
			return true;
		}

		/** Get the front item from the deque. */
		public int getFront() {
			if(length == 0){
				return -1;
			}
			return head.next.val;
		}

		/** Get the last item from the deque. */
		public int getRear() {
			if(length == 0){
				return -1;
			}
			return tail.prev.val;
		}

		/** Deletes an item from the front of Deque. Return true if the operation is successful. */
		public boolean deleteFront() {
			if(length == 0){
				return false;
			}
			DoublyListNode delete = head.next;
			DoublyListNode next = delete.next;

			head.next = next;
			next.prev = head;

			delete.prev = null;
			delete.next = null;

			length--;
			return true;
		}

		/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
		public boolean deleteLast() {
			if(length == 0){
				return false;
			}
			DoublyListNode delete = tail.prev;
			DoublyListNode prev = delete.prev;

			prev.next = tail;
			tail.prev = prev;

			delete.prev = null;
			delete.next = null;

			length--;
			return true;
		}
	}

	private final int k;
	private final DoublyList list;
	
	/** Initialize your data structure here. Set the size of the deque to be k. */
	public LC641_Design_Circular_Deque(int k) {
		this.k = k;
		list = new DoublyList();
	}

	/** Adds an item at the front of Deque. Return true if the operation is successful. */
	public boolean insertFront(int value) {
		if(isFull()){
			return false;
		}
		return list.insertFront(value);
	}

	/** Adds an item at the rear of Deque. Return true if the operation is successful. */
	public boolean insertLast(int value) {
		if(isFull()){
			return false;
		}
		return list.insertLast(value);
	}

	/** Deletes an item from the front of Deque. Return true if the operation is successful. */
	public boolean deleteFront() {
		return list.deleteFront();
	}

	/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
	public boolean deleteLast() {
		return list.deleteLast();
	}

	/** Get the front item from the deque. */
	public int getFront() {
		return list.getFront();
	}

	/** Get the last item from the deque. */
	public int getRear() {
		return list.getRear();
	}

	/** Checks whether the circular deque is empty or not. */
	public boolean isEmpty() {
		return (list.length == 0);
	}

	/** Checks whether the circular deque is full or not. */
	public boolean isFull() {
		return (list.length == k);
	}
}
