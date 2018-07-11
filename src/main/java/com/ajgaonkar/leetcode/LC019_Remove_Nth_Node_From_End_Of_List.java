package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC019_Remove_Nth_Node_From_End_Of_List {
	public class ListNode {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 0;
		ListNode last = head;
		ListNode prev = head;
		while (last.next != null) {
			count++;
			last = last.next;
			if (count > n) {

				prev = prev.next;
			}
			System.out.println("----");
			System.out.println(count);
			if (last != null) {
				System.out.println("last = " + last.val);
			}
			if (prev != null) {
				System.out.println("prev = " + prev.val);
			}
			System.out.println("----");
		}
		System.out.println(count);
		System.out.println(prev.val);
		if (count == 0) {
			return null;
		} else if (count + 1 == n) {
			return head.next;
		}
		ListNode next = null;
		if (prev.next != null) {
			next = prev.next.next;
			prev.next.next = null;
		}
		prev.next = next;
		return head;
	}
}
