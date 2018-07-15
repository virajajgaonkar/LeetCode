package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC092_Reverse_Linked_List_ii {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private void reverse(ListNode prev, ListNode start, ListNode end, ListNode next){
		ListNode c = start;
		ListNode pNode = prev;
		while(c != next){
			ListNode n = c.next;
			c.next = pNode;
			pNode = c;
			c = n;
		}
		if(prev != null){
			prev.next = end;
		}
		start.next = next;
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode current = head;
		int counter = 1;
		ListNode pNode = null;
		ListNode mNode = null;
		ListNode nNode = null;
		ListNode prev = null;
		while (current != null){
			if(counter == m) {
				pNode = prev;
				mNode = current;
			}
			if (counter == n){
				nNode = current;
			}
			counter++;
			prev = current;
			current = current.next;
		}
		reverse(pNode, mNode, nNode, nNode.next);
		if(m ==1){
			return nNode;
		} else {
			return head;
		}
	}
}
