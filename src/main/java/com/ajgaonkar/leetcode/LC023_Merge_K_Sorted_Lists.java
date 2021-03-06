package com.ajgaonkar.leetcode;

public class LC023_Merge_K_Sorted_Lists {
	/**
	 * Definition for singly-linked list.
	 */
	public static final class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private ListNode mergeTwoListsInternal(ListNode l1, ListNode l2){
		if(l1 == null){
			return l2;
		} else if(l2 == null){
			return l1;
		}
		if(l1.val <= l2.val){
			l1.next = mergeTwoListsInternal(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoListsInternal(l1, l2.next);
			return l2;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0){
			return null;
		}
		ListNode result = lists[0];
		for(int i=1; i < lists.length; i++){
			result = mergeTwoListsInternal(result, lists[i]);
		}
		return result;
	}
}
