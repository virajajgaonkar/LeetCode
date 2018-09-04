package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

/**
 List                 | Add  | Remove | Get  | Contains | Next | Size |  Data Structure
 ---------------------|------|--------|------|----------|------|------|-----------------------
 ArrayList            | O(1) |  O(n)  | O(1) |   O(n)   | O(1) | O(1) | Array
 LinkedList           | O(1) |  O(1)  | O(n) |   O(n)   | O(1) | O(1) | Linked List
 CopyOnWriteArrayList | O(n) |  O(n)  | O(1) |   O(n)   | O(1) | O(n) | Array
 */
public class CollectionsList {
	public void arrayList(){
		List<Integer> ascendingList = new ArrayList<>();
		List<Integer> descendingList = new ArrayList<>();

		for (int i=1; i <= 10; i++){
			ascendingList.add(i);
			descendingList.add(0, i);
		}

		System.out.println("----------");
		System.out.println("ascending");
		ascendingList.forEach(System.out::print);
		System.out.println();
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("descending");
		descendingList.forEach(System.out::print);
		System.out.println();
		System.out.println("----------");
	}

	public void testNullAndEmpty(){
		String[] arr2 = new String[0];
		List<String> lst2 = Lists.newArrayList(arr2);
		System.out.println(lst2 == null);
		System.out.println(lst2.size());
		System.out.println(lst2.get(0));


		String[] arr1 = null;
		List<String> lst1 = Lists.newArrayList(arr1);
		System.out.println(lst1 == null);
		System.out.println(lst1.size());
	}

	public void printList(List<Integer> lst){
		for(Integer c : lst){
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public void testShuffle(){
		List<Integer> list1 = new ArrayList<>();
		for(int i =1; i <= 100; i++){
			list1.add(i);
		}

		List<Integer> list2 = new ArrayList<>();
		for(int i =1; i <= 100; i++){
			list2.add(i);
		}
		printList(list1);
		printList(list2);

		Collections.shuffle(list1);
		Collections.shuffle(list2);

		printList(list1);
		printList(list2);
	}

	public static void main (String[] args){
		CollectionsList test = new CollectionsList();
		test.arrayList();
		test.testShuffle();
		test.testNullAndEmpty();
	}
}
