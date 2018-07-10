package com.ajgaonkar.leetcode;

public class LC234_Palindrome_Linked_List {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		if(head == null){
			return true;
		}
		ListNode fast = head;
		ListNode slow = head;
		while ((fast != null) && (fast.next != null)){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;
		while ((fast != null) && (slow!= null)){
			if(fast.val != slow.val){
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	private ListNode reverse(ListNode head){
		ListNode prev = null;
		ListNode current = head;
		while (current != null){
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}


}
