package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC061_Rotate_List {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private int getLength(ListNode head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return head;
		}
		if (k == 0) {
			return head;
		}
		if (k < 0) {
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = null;
		int count = 0;
		int length = getLength(head);
		if (length == 1) {
			return head;
		}
		int offset = 0;
		if (k > length) {
			offset = (k % length);
		} else if (k == length) {
			return head;
		} else {
			offset = k;
		}
		if (offset == 0) {
			return head;
		}
		while (p1.next != null) {
			p1 = p1.next;
			count++;
			if (p2 != null) {
				p2 = p2.next;
			}
			if (count == offset) {
				p2 = head;
			}
		}
		ListNode newHead = p2.next;
		p1.next = head;
		p2.next = null;
		return newHead;
	}
}
