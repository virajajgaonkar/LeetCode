package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC025_Reverse_Nodes_In_K_Group {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private void printList(ListNode head) {
		System.out.println("----");
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
		System.out.println("");
		System.out.println("----");
	}

	private void reverse(ListNode n1, ListNode n2) {
		//System.out.println("reverse n1 = " + n1.val + " n2 = " + n2.val);
		ListNode prev = null;
		while (n1 != n2) {
			ListNode next = n1.next;
			n1.next = prev;
			prev = n1;
			n1 = next;
		}
		n1.next = prev;
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		if (k == 1) {
			return head;
		}
		ListNode start = head;
		ListNode d = new ListNode(0);
		d.next = head;
		ListNode newHead = null;
		ListNode prevStart = null;

		int count = 0;
		while ((d != null) && (d.next != null)) {
			d = d.next;
			count++;
			//System.out.println("count = " + count + " d = " + d.val);
			if (count % k == 0) {
				if (newHead == null) {
					newHead = d;
				}
				ListNode next = d.next;
				reverse(start, d);
				if (prevStart != null) {
					prevStart.next = d;
				}
				start.next = next;
				prevStart = start;
				start = next;
				d = next;
				count++;
			}
		}
		return (newHead == null) ? head : newHead;
	}
}
