package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC004_MedianOfTwoSortedArrays_2Test {
	LC004_MedianOfTwoSortedArrays_2 test = new LC004_MedianOfTwoSortedArrays_2();
	@Test
	public void test1(){
		int[] nums1 = new int[] {1, 2};
		int[] nums2 = new int[] {3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(5.5, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void test2(){
		int[] nums1 = new int[] {1, 2};
		int[] nums2 = new int[] {3, 4, 5, 6, 7, 8, 9};
		assertEquals(5, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void test3(){
		int[] nums2 = new int[] {1, 2};
		int[] nums1 = new int[] {3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(5.5, test.findMedianSortedArrays(nums2, nums1), 0.0);
	}

	@Test
	public void test4(){
		int[] nums2 = new int[] {1, 2};
		int[] nums1 = new int[] {3, 4, 5, 6, 7, 8, 9};
		assertEquals(5, test.findMedianSortedArrays(nums2, nums1), 0.0);
	}

	@Test
	public void test5(){
		int[] nums1 = new int[] {1, 3, 5, 7, 9};
		int[] nums2 = new int[] {2, 4, 6, 8, 10};
		assertEquals(5.5, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void test6(){
		int[] nums1 = new int[] {1, 3};
		int[] nums2 = new int[] {2};
		assertEquals(2, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void test7(){
		int[] nums2 = new int[] {1, 3};
		int[] nums1 = new int[] {2};
		assertEquals(2, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

	@Test
	public void test8(){
		int[] nums1 = new int[] {1, 2, 3, 4, 5};
		int[] nums2 = new int[] {6, 7, 8, 9, 10};
		assertEquals(5.5, test.findMedianSortedArrays(nums1, nums2), 0.0);
	}

}