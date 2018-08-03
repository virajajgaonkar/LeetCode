package com.ajgaonkar.leetcode;

import java.util.PriorityQueue;

public class LC716_Max_Stack {
	public static class Node implements Comparable<Node>{
		private final int d;
		private final int index;
		private Node p = null;
		private Node n = null;
		private boolean del = false;

		public Node(int d, int index) {
			this.d = d;
			this.index = index;
		}

		@Override
		public int compareTo(Node o) {
			if(this.d == o.d){
				return o.index - this.index;
			}
			return o.d - this.d;
		}
	}
	private int size = 0;
	private Node top = null;
	private PriorityQueue<Node> q = new PriorityQueue<>();

	/** initialize your data structure here. */
	public LC716_Max_Stack() {
	}

	public void push(int x) {
		Node n = new Node(x, size);
		if(top == null){
			top = n;
		} else {
			top.n = n;
			n.p = top;
			top = n;
		}
		q.offer(n);
		size++;
	}

	public int pop() {
		while (top.del == true){
			top = top.p;
		}
		int val = top.d;
		top.del = true;
		top = top.p;
		size--;
		return val;
	}

	public int top() {
		while (top.del == true){
			top = top.p;
		}
		return top.d;
	}

	public int peekMax() {
		while (q.peek().del == true){
			q.poll();
		}
		return q.peek().d;
	}

	public int popMax() {
		while (q.peek().del == true){
			q.poll();
		}
		Node n = q.poll();
		n.del = true;
		return n.d;
	}
}
