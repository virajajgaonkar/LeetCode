package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LC023_Merge_K_Sorted_ListsTest {
	LC023_Merge_K_Sorted_Lists test = new LC023_Merge_K_Sorted_Lists();

	@Test
	public void test1(){
		LC023_Merge_K_Sorted_Lists.ListNode l1 = new LC023_Merge_K_Sorted_Lists.ListNode(1);
		LC023_Merge_K_Sorted_Lists.ListNode l2 = new LC023_Merge_K_Sorted_Lists.ListNode(2);
		LC023_Merge_K_Sorted_Lists.ListNode l3 = new LC023_Merge_K_Sorted_Lists.ListNode(3);
		LC023_Merge_K_Sorted_Lists.ListNode l4 = new LC023_Merge_K_Sorted_Lists.ListNode(4);
		LC023_Merge_K_Sorted_Lists.ListNode l5 = new LC023_Merge_K_Sorted_Lists.ListNode(5);
		LC023_Merge_K_Sorted_Lists.ListNode l6 = new LC023_Merge_K_Sorted_Lists.ListNode(6);
		LC023_Merge_K_Sorted_Lists.ListNode l7 = new LC023_Merge_K_Sorted_Lists.ListNode(7);
		LC023_Merge_K_Sorted_Lists.ListNode l8 = new LC023_Merge_K_Sorted_Lists.ListNode(8);

		l1.next = l5;
		l2.next = l6;
		l3.next = l7;
		l4.next = l8;
		l5.next = null;
		l6.next = null;
		l7.next = null;
		l8.next = null;

		LC023_Merge_K_Sorted_Lists.ListNode result = test.mergeKLists(new LC023_Merge_K_Sorted_Lists.ListNode[] {l1, l2, l3, l4});
		LC023_Merge_K_Sorted_Lists.ListNode current = result;
		List<Integer> list = new ArrayList();
		while (current != null){
			list.add(current.val);
			current = current.next;
		}
		assertEquals(list.size(), 8);
		for(int i=0; i<8; i++){
			assertEquals(list.get(i), (Integer) (i+1));
		}
	}
}