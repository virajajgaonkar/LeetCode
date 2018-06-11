package com.ajgaonkar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC146_LRU_Cache {
	public static final class LRU_Cache_Node {
		public final int k;
		public final int v;
		public LRU_Cache_Node prev;
		public LRU_Cache_Node next;

		public LRU_Cache_Node(int k, int v) {
			this.k = k;
			this.v = v;
			this.prev = null;
			this.next = null;
		}
	}

	private final int capacity;
	private final LRU_Cache_Node head;
	private final LRU_Cache_Node tail;
	private final Map<Integer, LRU_Cache_Node> map;

	public LC146_LRU_Cache(int capacity) {
		this.capacity = capacity;
		this.head = new LRU_Cache_Node(-1, -1);
		this.tail = new LRU_Cache_Node(-1, -1);
		this.head.next = this.tail;
		this.tail.prev = this.head;
		this.map = new HashMap<Integer, LRU_Cache_Node>();
	}

	private void insertAtHead(LRU_Cache_Node node) {
		LRU_Cache_Node p = head;
		LRU_Cache_Node n = head.next;
		p.next = node;
		node.prev = p;
		n.prev = node;
		node.next = n;
	}

	private LRU_Cache_Node delete(LRU_Cache_Node node) {
		LRU_Cache_Node p = node.prev;
		LRU_Cache_Node n = node.next;
		p.next = n;
		n.prev = p;
		return node;
	}

	public int get(int key) {
		if (!this.map.containsKey(key)) {
			return -1;
		} else {
			LRU_Cache_Node current = this.map.get(key);
			delete(current);
			insertAtHead(current);
			return current.v;
		}
	}

	public void put(int key, int value) {
		if (this.map.containsKey(key)) {
			delete(this.map.get(key));
			LRU_Cache_Node newNode = new LRU_Cache_Node(key, value);
			insertAtHead(newNode);
			map.put(key, newNode);
		} else {
			if (map.size() == capacity) {
				LRU_Cache_Node delete = delete(tail.prev);
				map.remove(delete.k);
			}
			LRU_Cache_Node newNode = new LRU_Cache_Node(key, value);
			insertAtHead(newNode);
			map.put(key, newNode);
		}
	}
}
