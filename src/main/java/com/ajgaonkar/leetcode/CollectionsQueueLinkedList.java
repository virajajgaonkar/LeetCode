package com.ajgaonkar.leetcode;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Queue is an interface.
 * 			Throws exception	Returns special value
 * Insert	add(e)				offer(e)
 * Remove	remove()			poll()
 * Examine	element()			peek()
 *
 * queue.isEmpty()
 *
 * queue.offer(E) => boolean queue.offer(E)
 * queue.peek() => E queue.peek()
 * queue.poll() => E queue.poll()
 *
 * queue.add(E) => boolean queue.add(E)	RE IllegalStateException
 * queue.element() => E queue.element()	RE NoSuchElementException
 * queue.remove() => E queue.remove()	RE NoSuchElementException
 */
public class CollectionsQueueLinkedList {
	private static final int SIZE = 10;
	private final Queue<Integer> queue1;
	private final Queue<Integer> queue2;

	public CollectionsQueueLinkedList() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
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

	public static void main (String[] args){
		CollectionsQueueLinkedList test = new CollectionsQueueLinkedList();
		test.testSafe();
		System.out.println("------------------------");
		test.testUnSafe();
	}


}
