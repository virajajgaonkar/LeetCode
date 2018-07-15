package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC328_Odd_Even_Linked_List {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if(head == null){
			return head;
		}
		ListNode dOdd = new ListNode(-1);
		ListNode dEven = new ListNode(-1);
		ListNode currentOdd = dOdd;
		ListNode currentEven = dEven;
		ListNode c = head;
		int counter =0;
		while (c != null){
			counter++;
			ListNode next = c.next;
			if(counter %2 !=0){
				currentOdd.next = c;
				currentOdd = currentOdd.next;
			} else {
				currentEven.next = c;
				currentEven = currentEven.next;
			}
			c = next;
		}
		currentEven.next = null;
		currentOdd.next = dEven.next;
		return dOdd.next;
	}
}
