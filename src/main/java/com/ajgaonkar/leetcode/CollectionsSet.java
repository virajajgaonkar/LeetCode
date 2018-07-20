package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 Set                   |    Add   |  Remove  | Contains |   Next   | Size | Data Structure
 ----------------------|----------|----------|----------|----------|------|-------------------------
 HashSet               | O(1)     | O(1)     | O(1)     | O(h/n)   | O(1) | Hash Table
 LinkedHashSet         | O(1)     | O(1)     | O(1)     | O(1)     | O(1) | Hash Table + Linked List
 EnumSet               | O(1)     | O(1)     | O(1)     | O(1)     | O(1) | Bit Vector
 TreeSet               | O(log n) | O(log n) | O(log n) | O(log n) | O(1) | Red-black tree
 CopyOnWriteArraySet   | O(n)     | O(n)     | O(n)     | O(1)     | O(1) | Array
 ConcurrentSkipListSet | O(log n) | O(log n) | O(log n) | O(1)     | O(n) | Skip List
 */

public class CollectionsSet {
	private final Set<Integer> set1;
	private final Set<Integer> set2;
	private final Set<Integer> set3;

	public CollectionsSet() {
		set1 = new HashSet<>();
		set2 = new LinkedHashSet<>();
		set3 = new TreeSet<>();
	}

	public void test(){
		int[] arr = new int[]{53, 27, 18, 93, 11, 42, 53, 27, 18, 93, 11, 42};
		for(int i=0; i< arr.length; i++){
			set1.add(arr[i]);
			set2.add(arr[i]);
			set3.add(arr[i]);
		}
		set1.forEach(System.out::println);
		System.out.println("-----");
		set2.forEach(System.out::println);
		System.out.println("-----");
		set3.forEach(System.out::println);
	}

	public static void main(String[] args){
		CollectionsSet test = new CollectionsSet();
		test.test();
	}
}
