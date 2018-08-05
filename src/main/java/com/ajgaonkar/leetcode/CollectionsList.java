package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

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

	public static void main (String[] args){
		CollectionsList test = new CollectionsList();
		test.arrayList();
	}
}
