package com.ajgaonkar.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
