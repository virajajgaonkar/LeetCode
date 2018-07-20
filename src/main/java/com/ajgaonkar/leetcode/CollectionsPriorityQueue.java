package com.ajgaonkar.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 * PriorityQueue keeps elements Sorted by default.
 * O(log(n)) time for the enqueing and dequeing methods (offer, poll, remove() and  add);
 * linear time for the remove(Object) and contains(Object) methods; and
 * constant time for the retrieval methods (peek,  element, and size).
 */
public class CollectionsPriorityQueue {
	private static final int SIZE = 10;
	private final PriorityQueue<Integer> queue1;
	private final PriorityQueue<Integer> queue2;


	public CollectionsPriorityQueue() {
		queue1 = new PriorityQueue<>(SIZE);
		queue2 = new PriorityQueue<>(SIZE);
	}
	public void testSafe(){
		for(int i=10; i>=1; i--){
			boolean offerResult = queue1.offer(i);
			System.out.println("offerResult =  " + offerResult);
		}

		boolean offerResult = queue1.offer(11);
		System.out.println("offerResult =  " + offerResult);

		while (!queue1.isEmpty()){
			Integer peeked = queue1.peek();
			Integer popped = queue1.poll();
			System.out.println("peeked = " +  peeked + " popped = " + popped);
		}

		//One Extra Get & Remove
		Integer peeked = queue1.peek();
		Integer popped = queue1.poll();
		System.out.println("peeked = " +  peeked + " popped = " + popped);
	}

	public void testUnSafe(){
		for(int i=10; i>=1; i--){
			boolean addResult = queue2.add(i);
			System.out.println("addResult =  " + addResult);
		}

		boolean addResult = queue2.add(11);
		System.out.println("addResult =  " + addResult);

		while (!queue2.isEmpty()){
			Integer element = queue2.element();
			Integer remove = queue2.remove();
			System.out.println("element = " +  element + " remove = " + remove);
		}

		//One Extra Get & Remove
		Integer element = null;
		try{
			element = queue2.element();
		} catch (NoSuchElementException e){
			System.out.println("NoSuchElementException received!!");
		}
		Integer remove = null;
		try{
			remove = queue2.remove();
		} catch (NoSuchElementException e){
			System.out.println("NoSuchElementException received!!");
		}
		System.out.println("element = " +  element + " remove = " + remove);
	}

	public void testStringSort(){
		PriorityQueue<String> q = new PriorityQueue<>();
		q.offer("aaa");
		q.offer("aa");
		q.offer("a");
		System.out.println("PriorityQueue Iterator");
		Iterator<String> it = q.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------");
		System.out.println("PriorityQueue Poll");
		while (q.size() >0){
			System.out.println(q.poll());
		}
		System.out.println("---------------");
		System.out.println("Collections sort");
		List<String> arr = Arrays.asList("aaa", "aa", "a");
		Collections.sort(arr);
		arr.forEach(System.out::println);
		System.out.println("---------------");
		System.out.println("a".compareTo("aa"));
		System.out.println("a".compareTo("aaa"));
		System.out.println("aa".compareTo("aaa"));

		System.out.println("aa".compareTo("a"));
		System.out.println("aaa".compareTo("a"));
		System.out.println("aaa".compareTo("aa"));
		System.out.println("---------------");
	}

	public static void main (String[] args){
		CollectionsPriorityQueue test = new CollectionsPriorityQueue();
		test.testSafe();
		System.out.println("------------------------");
		test.testUnSafe();
		System.out.println("------------------------");
		test.testStringSort();


		boolean startsWith = true;
		boolean doesNotStartWith = !startsWith;

		boolean c1 = false;
		boolean c2 = !c1;
		boolean c3 = doesNotStartWith;

		if (c1 || c2 && !c3) {
			System.out.println("Hit");
		} else {
			System.out.println("Miss");
		}
	}
}
