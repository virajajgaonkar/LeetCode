package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC002_Add_Two_Numbers {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode l3 = null;
		ListNode l3Current = null;
		int carryForward = 0;
		while ((l1 != null) || (l2 != null) || (carryForward > 0)) {
			int val1 = (l1 != null) ? l1.val : 0;
			int val2 = (l2 != null) ? l2.val : 0;
			int total = val1 + val2 + carryForward;
			carryForward = total / 10;
			int remainder = total % 10;
			ListNode current = new ListNode(remainder);
			current.next = null;
			if (l3Current == null) {
				l3 = current;
				l3Current = current;
			} else {
				l3Current.next = current;
				l3Current = current;
			}
			l1 = (l1 != null) ? l1.next : null;
			l2 = (l2 != null) ? l2.next : null;
		}
		return l3;
	}
}
