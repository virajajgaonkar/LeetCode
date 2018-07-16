package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC025_Reverse_Nodes_In_K_GroupTest {
	LC025_Reverse_Nodes_In_K_Group test = new LC025_Reverse_Nodes_In_K_Group();
	@Test
	public void test(){
		LC025_Reverse_Nodes_In_K_Group.ListNode n1 = new LC025_Reverse_Nodes_In_K_Group.ListNode(1);
		LC025_Reverse_Nodes_In_K_Group.ListNode n2 = new LC025_Reverse_Nodes_In_K_Group.ListNode(2);
		LC025_Reverse_Nodes_In_K_Group.ListNode n3 = new LC025_Reverse_Nodes_In_K_Group.ListNode(3);
		LC025_Reverse_Nodes_In_K_Group.ListNode n4 = new LC025_Reverse_Nodes_In_K_Group.ListNode(4);
		LC025_Reverse_Nodes_In_K_Group.ListNode n5 = new LC025_Reverse_Nodes_In_K_Group.ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		LC025_Reverse_Nodes_In_K_Group.ListNode newHead = test.reverseKGroup(n1, 3);
		List<Integer> actual = new ArrayList<>();
		LC025_Reverse_Nodes_In_K_Group.ListNode current = newHead;
		while (current != null){
			actual.add(current.val);
			current = current.next;
		}
		assertEquals(actual, Arrays.asList(3,2,1,4,5));
	}

	@Test
	public void test2(){
		LC025_Reverse_Nodes_In_K_Group.ListNode n1 = new LC025_Reverse_Nodes_In_K_Group.ListNode(1);
		LC025_Reverse_Nodes_In_K_Group.ListNode n2 = new LC025_Reverse_Nodes_In_K_Group.ListNode(2);
		LC025_Reverse_Nodes_In_K_Group.ListNode n3 = new LC025_Reverse_Nodes_In_K_Group.ListNode(3);
		LC025_Reverse_Nodes_In_K_Group.ListNode n4 = new LC025_Reverse_Nodes_In_K_Group.ListNode(4);
		LC025_Reverse_Nodes_In_K_Group.ListNode n5 = new LC025_Reverse_Nodes_In_K_Group.ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		LC025_Reverse_Nodes_In_K_Group.ListNode newHead = test.reverseKGroup(n1, 5);
		List<Integer> actual = new ArrayList<>();
		LC025_Reverse_Nodes_In_K_Group.ListNode current = newHead;
		while (current != null){
			actual.add(current.val);
			current = current.next;
		}
		assertEquals(actual, Arrays.asList(5,4,3,2,1));
	}

	@Test
	public void test3(){
		LC025_Reverse_Nodes_In_K_Group.ListNode n1 = new LC025_Reverse_Nodes_In_K_Group.ListNode(1);
		LC025_Reverse_Nodes_In_K_Group.ListNode n2 = new LC025_Reverse_Nodes_In_K_Group.ListNode(2);
		LC025_Reverse_Nodes_In_K_Group.ListNode n3 = new LC025_Reverse_Nodes_In_K_Group.ListNode(3);
		LC025_Reverse_Nodes_In_K_Group.ListNode n4 = new LC025_Reverse_Nodes_In_K_Group.ListNode(4);
		LC025_Reverse_Nodes_In_K_Group.ListNode n5 = new LC025_Reverse_Nodes_In_K_Group.ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		LC025_Reverse_Nodes_In_K_Group.ListNode newHead = test.reverseKGroup(n1, 6);
		List<Integer> actual = new ArrayList<>();
		LC025_Reverse_Nodes_In_K_Group.ListNode current = newHead;
		while (current != null){
			actual.add(current.val);
			current = current.next;
		}
		assertEquals(actual, Arrays.asList(1,2,3,4,5));
	}


	@Test
	public void test4(){
		LC025_Reverse_Nodes_In_K_Group.ListNode n1 = new LC025_Reverse_Nodes_In_K_Group.ListNode(1);
		LC025_Reverse_Nodes_In_K_Group.ListNode n2 = new LC025_Reverse_Nodes_In_K_Group.ListNode(2);
		LC025_Reverse_Nodes_In_K_Group.ListNode n3 = new LC025_Reverse_Nodes_In_K_Group.ListNode(3);
		LC025_Reverse_Nodes_In_K_Group.ListNode n4 = new LC025_Reverse_Nodes_In_K_Group.ListNode(4);
		LC025_Reverse_Nodes_In_K_Group.ListNode n5 = new LC025_Reverse_Nodes_In_K_Group.ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		LC025_Reverse_Nodes_In_K_Group.ListNode newHead = test.reverseKGroup(n1, 2);
		List<Integer> actual = new ArrayList<>();
		LC025_Reverse_Nodes_In_K_Group.ListNode current = newHead;
		while (current != null){
			actual.add(current.val);
			current = current.next;
		}
		assertEquals(actual, Arrays.asList(2,1,4,3,5));
	}

}