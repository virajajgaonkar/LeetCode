package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class CollectionsSetTest {

	private void insertData(Set<Integer> set){
		set.add(50);
		set.add(-50);
		set.add(40);
		set.add(-40);
		set.add(30);
		set.add(-30);
		set.add(20);
		set.add(-20);
		set.add(10);
		set.add(-10);
		set.add(0);
	}

	@Test
	public void test1(){
		Set<Integer> set1 = new HashSet<>();
		insertData(set1);
		Set<Integer> set2 = new TreeSet<>();
		insertData(set2);
		Set<Integer> set3 = new LinkedHashSet<>();
		insertData(set3);

		System.out.println("-------");
		System.out.println("HashSet");
		set1.stream().forEach(System.out::println);

		System.out.println("-------");
		System.out.println("TreeSet");
		set2.stream().forEach(System.out::println);

		System.out.println("-------");
		System.out.println("LinkedHashSet");
		set3.stream().forEach(System.out::println);
	}

}