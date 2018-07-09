package com.ajgaonkar.leetcode;

public class LC206_Reverse_Linked_List {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		while (current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
