package com.ajgaonkar.leetcode;

public class LC622_Design_Circular_Queue_2 {
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

		public boolean insert(int v){

			DoublyListNode prev = tail.prev;
			DoublyListNode n = new DoublyListNode(v);

			prev.next = n;
			n.prev = prev;
			n.next = tail;
			tail.prev = n;
			length++;
			return true;
		}

		public int remove(){
			DoublyListNode delete = head.next;
			DoublyListNode next = delete.next;
			head.next = next;
			next.prev = head;

			delete.next = null;
			delete.prev = null;
			length--;
			return delete.val;
		}

	}

	private final int k;
	private final DoublyList list;

	public LC622_Design_Circular_Queue_2(int k){
		this.k = k;
		list = new DoublyList();
	}
	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(isFull()){
			return false;
		}
		return list.insert(value);
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(isEmpty()){
			return false;
		}
		list.remove();
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if(isEmpty()){
			return -1;
		}
		return list.head.next.val;
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isEmpty()){
			return -1;
		}
		return list.tail.prev.val;
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return (list.length == 0);
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return (list.length == k);
	}
}
