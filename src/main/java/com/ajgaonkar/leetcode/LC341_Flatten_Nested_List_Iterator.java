package com.ajgaonkar.leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LC341_Flatten_Nested_List_Iterator implements Iterator<Integer> {
	public interface NestedInteger {
		public boolean isInteger();
		public Integer getInteger();
		public List<NestedInteger> getList();
	}

	private Stack<Iterator<NestedInteger>> stack = new Stack<>();
	private Iterator<NestedInteger> currentIterator;
	private Integer next = null;
	private Boolean hasNext = null;

	public LC341_Flatten_Nested_List_Iterator(List<NestedInteger> nestedList) {
		currentIterator = nestedList.iterator();
	}

	@Override
	public boolean hasNext() {
		if(hasNext != null){
			return hasNext;
		}
		hasNext = moveToNext();
		return hasNext;
	}

	@Override
	public Integer next() {
		if(!hasNext()){
			throw new RuntimeException("Object does not exist!!");
		}
		hasNext = null;
		return next;
	}

	private boolean moveToNext(){
		while (true) {
			if(currentIterator == null){
				if(stack.isEmpty()){
					return false;
				}
				currentIterator = stack.pop();
				continue;
			}
			if(!currentIterator.hasNext()) {
				currentIterator = null;
				continue;
			}

			NestedInteger ni = currentIterator.next();
			if(!ni.isInteger()){
				stack.push(currentIterator);
				currentIterator = ni.getList().iterator();
				continue;
			}
			next = ni.getInteger();
			return true;
		}
	}
}
