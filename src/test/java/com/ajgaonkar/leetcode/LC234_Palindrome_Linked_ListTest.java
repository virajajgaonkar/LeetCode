package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC234_Palindrome_Linked_ListTest {
	LC234_Palindrome_Linked_List test = new LC234_Palindrome_Linked_List();
	@Test
	public void test1(){
		LC234_Palindrome_Linked_List.ListNode l1 = new LC234_Palindrome_Linked_List.ListNode(1);
		LC234_Palindrome_Linked_List.ListNode l2 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l3 = new LC234_Palindrome_Linked_List.ListNode(3);
		LC234_Palindrome_Linked_List.ListNode l4 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l5 = new LC234_Palindrome_Linked_List.ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		assertEquals(true, test.isPalindrome(l1));
	}
	@Test
	public void test2(){
		LC234_Palindrome_Linked_List.ListNode l1 = new LC234_Palindrome_Linked_List.ListNode(1);
		LC234_Palindrome_Linked_List.ListNode l2 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l3 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l4 = new LC234_Palindrome_Linked_List.ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		assertEquals(true, test.isPalindrome(l1));
	}
	@Test
	public void test3(){
		LC234_Palindrome_Linked_List.ListNode l1 = new LC234_Palindrome_Linked_List.ListNode(1);
		assertEquals(true, test.isPalindrome(l1));
	}
	@Test
	public void test4(){
		LC234_Palindrome_Linked_List.ListNode l1 = new LC234_Palindrome_Linked_List.ListNode(1);
		LC234_Palindrome_Linked_List.ListNode l2 = new LC234_Palindrome_Linked_List.ListNode(2);
		l1.next = l2;
		assertEquals(false, test.isPalindrome(l1));
	}
	@Test
	public void test5(){
		LC234_Palindrome_Linked_List.ListNode l1 = new LC234_Palindrome_Linked_List.ListNode(1);
		LC234_Palindrome_Linked_List.ListNode l2 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l3 = new LC234_Palindrome_Linked_List.ListNode(3);
		LC234_Palindrome_Linked_List.ListNode l4 = new LC234_Palindrome_Linked_List.ListNode(2);
		LC234_Palindrome_Linked_List.ListNode l5 = new LC234_Palindrome_Linked_List.ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		assertEquals(true, test.isPalindrome(l1));
	}

}