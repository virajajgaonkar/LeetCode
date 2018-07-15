package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC460_LFU_Cache {
	public static class Node{
		private final int k;
		private int v;
		private int cnt;
		private Node prev;
		private Node next;

		public Node(int k, int v) {
			this.k = k;
			this.v = v;
			this.cnt =1;
		}
	}
	public static class DLList {
		private Node head;
		private Node tail;
		private int size;

		public DLList() {
			head = new Node(0, 0);
			tail = new Node(0, 0);
			head.prev = tail;
			head.next = tail;
			tail.prev = head;
			tail.next = head;
		}

		public void add(Node node){
			Node next = head.next;
			head.next = node;
			node.prev = head;
			node.next = next;
			next.prev = node;
			size++;
		}

		public void remove(Node node){
			if(node == null){
				return;
			}
			Node prev = node.prev;
			Node next = node.next;
			prev.next = next;
			next.prev = prev;
			size--;
		}

		public Node removeLast(){
			Node delete = tail.prev;
			remove(delete);
			return delete;
		}
	}

	private final int capacity;
	Map<Integer, Node> vals;
	Map<Integer, DLList> counts;
	private int min;


	public LC460_LFU_Cache(int capacity) {
		this.capacity = capacity;
		this.vals = new HashMap<>();
		this.counts = new HashMap<>();
		this.min = 0;

	}

	public int get(int key) {
		if(capacity == 0){
			return  -1;
		}
		if(!vals.containsKey(key)){
			return -1;
		}
		Node node = vals.get(key);
		update(node);
		return node.v;
	}

	public void put(int key, int value) {
		if(capacity == 0){
			return;
		}
		if(vals.containsKey(key)){
			Node node = vals.get(key);
			node.v = value;
			update(node);
		} else {
			if(vals.size() == capacity){
				DLList lst = counts.get(min);
				Node deleted = lst.removeLast();
				vals.remove(deleted.k);
			}
			Node newNode = new Node(key, value);
			vals.put(key, newNode);
			DLList lst = counts.getOrDefault(1, new DLList());
			lst.add(newNode);
			counts.put(1, lst);
			min = 1;
		}
	}

	private void update(Node node){
		if(node == null){
			return;
		}
		int currentCount = node.cnt;
		counts.get(currentCount).remove(node);
		int newCount = currentCount +1;
		node.cnt = newCount;
		DLList head = counts.getOrDefault(newCount, new DLList());
		head.add(node);
		counts.put(newCount, head);
		if((currentCount == min) && (counts.get(currentCount).size == 0)){
			min++;
		}
	}
}
