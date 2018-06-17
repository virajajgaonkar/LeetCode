package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LC021_Merge_Two_Sorted_ListsTest {
	LC021_Merge_Two_Sorted_Lists test = new LC021_Merge_Two_Sorted_Lists();


	@Test
	public void test1(){
		LC021_Merge_Two_Sorted_Lists.ListNode l1 = new LC021_Merge_Two_Sorted_Lists.ListNode(1);
		LC021_Merge_Two_Sorted_Lists.ListNode l2 = new LC021_Merge_Two_Sorted_Lists.ListNode(2);
		LC021_Merge_Two_Sorted_Lists.ListNode l3 = new LC021_Merge_Two_Sorted_Lists.ListNode(3);
		LC021_Merge_Two_Sorted_Lists.ListNode l4 = new LC021_Merge_Two_Sorted_Lists.ListNode(4);
		LC021_Merge_Two_Sorted_Lists.ListNode l5 = new LC021_Merge_Two_Sorted_Lists.ListNode(5);
		LC021_Merge_Two_Sorted_Lists.ListNode l6 = new LC021_Merge_Two_Sorted_Lists.ListNode(6);
		LC021_Merge_Two_Sorted_Lists.ListNode l7 = new LC021_Merge_Two_Sorted_Lists.ListNode(7);

		l1.next = l3;
		l3.next = l5;
		l5.next = null;

		l2.next = l4;
		l4.next = l6;
		l6.next = null;

		LC021_Merge_Two_Sorted_Lists.ListNode result = test.mergeTwoLists(l1, l2);
		LC021_Merge_Two_Sorted_Lists.ListNode current = result;
		List<Integer> list = new ArrayList();
		while (current != null){
			list.add(current.val);
			current = current.next;
		}
		assertEquals(list.size(), 6);
		for(int i=0; i<6; i++){
			assertEquals(list.get(i), (Integer) (i+1));
		}
	}

	@Test
	public void test2(){
		LC021_Merge_Two_Sorted_Lists.ListNode l1 = new LC021_Merge_Two_Sorted_Lists.ListNode(1);
		LC021_Merge_Two_Sorted_Lists.ListNode l2 = new LC021_Merge_Two_Sorted_Lists.ListNode(2);
		LC021_Merge_Two_Sorted_Lists.ListNode l3 = new LC021_Merge_Two_Sorted_Lists.ListNode(3);
		LC021_Merge_Two_Sorted_Lists.ListNode l4 = new LC021_Merge_Two_Sorted_Lists.ListNode(4);
		LC021_Merge_Two_Sorted_Lists.ListNode l5 = new LC021_Merge_Two_Sorted_Lists.ListNode(5);
		LC021_Merge_Two_Sorted_Lists.ListNode l6 = new LC021_Merge_Two_Sorted_Lists.ListNode(6);
		LC021_Merge_Two_Sorted_Lists.ListNode l7 = new LC021_Merge_Two_Sorted_Lists.ListNode(7);

		l1.next = l3;
		l3.next = l5;
		l5.next = l7;
		l7.next = null;

		l2.next = l4;
		l4.next = l6;
		l6.next = null;

		LC021_Merge_Two_Sorted_Lists.ListNode result = test.mergeTwoLists(l1, l2);
		LC021_Merge_Two_Sorted_Lists.ListNode current = result;
		List<Integer> list = new ArrayList();
		while (current != null){
			list.add(current.val);
			current = current.next;
		}
		assertEquals(list.size(), 7);
		for(int i=0; i<7; i++){
			assertEquals(list.get(i), (Integer) (i+1));
		}
	}

	@Test
	public void test3(){
		LC021_Merge_Two_Sorted_Lists.ListNode l1 = new LC021_Merge_Two_Sorted_Lists.ListNode(1);
		LC021_Merge_Two_Sorted_Lists.ListNode l2 = new LC021_Merge_Two_Sorted_Lists.ListNode(2);
		LC021_Merge_Two_Sorted_Lists.ListNode l3 = new LC021_Merge_Two_Sorted_Lists.ListNode(3);
		LC021_Merge_Two_Sorted_Lists.ListNode l4 = new LC021_Merge_Two_Sorted_Lists.ListNode(4);
		LC021_Merge_Two_Sorted_Lists.ListNode l5 = new LC021_Merge_Two_Sorted_Lists.ListNode(5);
		LC021_Merge_Two_Sorted_Lists.ListNode l6 = new LC021_Merge_Two_Sorted_Lists.ListNode(6);
		LC021_Merge_Two_Sorted_Lists.ListNode l7 = new LC021_Merge_Two_Sorted_Lists.ListNode(7);

		l1.next = l2;
		l2.next = l3;
		l3.next = null;

		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;

		LC021_Merge_Two_Sorted_Lists.ListNode result = test.mergeTwoLists(l1, l4);
		LC021_Merge_Two_Sorted_Lists.ListNode current = result;
		List<Integer> list = new ArrayList();
		while (current != null){
			list.add(current.val);
			current = current.next;
		}
		assertEquals(list.size(), 7);
		for(int i=0; i<7; i++){
			assertEquals(list.get(i), (Integer) (i+1));
		}
	}

	@Test
	public void test4(){
		LC021_Merge_Two_Sorted_Lists.ListNode l1 = new LC021_Merge_Two_Sorted_Lists.ListNode(1);
		LC021_Merge_Two_Sorted_Lists.ListNode l2 = new LC021_Merge_Two_Sorted_Lists.ListNode(2);
		LC021_Merge_Two_Sorted_Lists.ListNode l3 = new LC021_Merge_Two_Sorted_Lists.ListNode(3);
		LC021_Merge_Two_Sorted_Lists.ListNode l4 = new LC021_Merge_Two_Sorted_Lists.ListNode(4);
		LC021_Merge_Two_Sorted_Lists.ListNode l5 = new LC021_Merge_Two_Sorted_Lists.ListNode(5);
		LC021_Merge_Two_Sorted_Lists.ListNode l6 = new LC021_Merge_Two_Sorted_Lists.ListNode(6);
		LC021_Merge_Two_Sorted_Lists.ListNode l7 = new LC021_Merge_Two_Sorted_Lists.ListNode(7);

		l1.next = l2;
		l2.next = l3;
		l3.next = null;

		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;

		LC021_Merge_Two_Sorted_Lists.ListNode result = test.mergeTwoLists(l4, l1);
		LC021_Merge_Two_Sorted_Lists.ListNode current = result;
		List<Integer> list = new ArrayList();
		while (current != null){
			list.add(current.val);
			current = current.next;
		}
		assertEquals(list.size(), 7);
		for(int i=0; i<7; i++){
			assertEquals(list.get(i), (Integer) (i+1));
		}
	}

}