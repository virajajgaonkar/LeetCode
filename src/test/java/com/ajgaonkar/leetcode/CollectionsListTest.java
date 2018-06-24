package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class CollectionsListTest {
	private void insertData(List<Integer> lst){
		lst.add(50);
		lst.add(-50);
		lst.add(40);
		lst.add(-40);
		lst.add(30);
		lst.add(-30);
		lst.add(20);
		lst.add(-20);
		lst.add(10);
		lst.add(-10);
		lst.add(0);
	}
	@Test
	public void test1(){
		List<Integer> lst1 = new ArrayList<Integer>();
		insertData(lst1);
		List<Integer> lst2 = new LinkedList<Integer>();
		insertData(lst2);
		List<Integer> lst3 = new Stack<Integer>();
		insertData(lst3);

		lst1.stream().forEach(System.out::println);
		lst2.stream().forEach(System.out::println);
		lst3.stream().forEach(System.out::println);
	}

}