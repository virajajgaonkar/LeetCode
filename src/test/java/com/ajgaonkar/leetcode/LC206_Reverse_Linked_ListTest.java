package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC206_Reverse_Linked_ListTest {
	LC206_Reverse_Linked_List test = new LC206_Reverse_Linked_List();
	@Test
	public void test(){
		LC206_Reverse_Linked_List.ListNode n1 = new LC206_Reverse_Linked_List.ListNode(1);
		LC206_Reverse_Linked_List.ListNode n2 = new LC206_Reverse_Linked_List.ListNode(2);
		LC206_Reverse_Linked_List.ListNode n3 = new LC206_Reverse_Linked_List.ListNode(3);
		LC206_Reverse_Linked_List.ListNode n4 = new LC206_Reverse_Linked_List.ListNode(4);
		LC206_Reverse_Linked_List.ListNode n5 = new LC206_Reverse_Linked_List.ListNode(5);
		n1.next  = n2;
		n2.next  = n3;
		n3.next  = n4;
		n4.next  = n5;

		LC206_Reverse_Linked_List.ListNode result = test.reverseList(n1);
		List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
		List<Integer> actual = new ArrayList<>();
		LC206_Reverse_Linked_List.ListNode current = result;
		while (current != null){
			actual.add(current.val);
			current = current.next;
		}
		assertArrayEquals(expected.toArray(), actual.toArray());
	}

}