package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LC381_Insert_Delete_Getrandom_O1_Duplicates_Allowed {
	private final List<Integer> list;
	private final Map<Integer, Set<Integer>> locations;
	private final Random rand;

	public LC381_Insert_Delete_Getrandom_O1_Duplicates_Allowed() {
		list = new ArrayList<>();
		locations = new HashMap<>();
		rand = new Random((new Date()).getTime());
	}

	/** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	public boolean insert(int val) {
		boolean exists = locations.containsKey(val);
		if(!exists){
			locations.put(val, new HashSet<>());
		}
		int newIndex = list.size();
		list.add(val);
		locations.get(val).add(newIndex);
		return !exists;
	}

	/** Removes a value from the collection. Returns true if the collection contained the specified element. */
	public boolean remove(int val) {
		if(!locations.containsKey(val)){
			return false;
		}
		int lastIndex = list.size() -1;
		if(!locations.get(val).contains(lastIndex)){
			int currentIndex = locations.get(val).iterator().next();
			int lastIndexValue = list.get(lastIndex);
			locations.get(lastIndexValue).remove(lastIndex);
			locations.get(lastIndexValue).add(currentIndex);

			locations.get(val).remove(currentIndex);
			locations.get(val).add(lastIndex);

			list.set(currentIndex, lastIndexValue);
		}

		locations.get(val).remove(lastIndex);
		if(locations.get(val).isEmpty()){
			locations.remove(val);
		}
		list.remove(lastIndex);
		return true;
	}

	/** Get a random element from the collection. */
	public int getRandom() {
		return list.get(Math.abs(rand.nextInt()) % list.size());
	}
}
