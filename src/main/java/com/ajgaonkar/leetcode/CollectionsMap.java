package com.ajgaonkar.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 Map                   |   Get    | ContainsKey |   Next   | Data Structure
 ----------------------|----------|-------------|----------|-------------------------
 HashMap               | O(1)     |   O(1)      | O(h / n) | Hash Table
 LinkedHashMap         | O(1)     |   O(1)      | O(1)     | Hash Table + Linked List
 IdentityHashMap       | O(1)     |   O(1)      | O(h / n) | Array
 WeakHashMap           | O(1)     |   O(1)      | O(h / n) | Hash Table
 EnumMap               | O(1)     |   O(1)      | O(1)     | Array
 TreeMap               | O(log n) |   O(log n)  | O(log n) | Red-black tree
 ConcurrentHashMap     | O(1)     |   O(1)      | O(h / n) | Hash Tables
 ConcurrentSkipListMap | O(log n) | O(log n)    | O(1)     | Skip List
 */
public class CollectionsMap {
	private void useMap(Map<Integer, Integer> m){
		m.put(33, 3);
		m.put(44, 4);
		m.put(22, 2);
		m.put(55, 5);
		m.put(66, 6);
		m.put(11, 1);
	}
	private void printMap(Map<Integer, Integer> m){
		System.out.println("-------------");
		m.entrySet().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
		System.out.println("-------------");
	}

	private void testHashMap(){
		Map<Integer, Integer> map = new HashMap<>();
		useMap(map);
		printMap(map);
	}
	private void testLinkedHashMap(){
		Map<Integer, Integer> map = new LinkedHashMap<>();
		useMap(map);
		printMap(map);
	}
	private void testTreeMapAscendig(){
		Map<Integer, Integer> map = new TreeMap<>();
		useMap(map);
		printMap(map);
	}
	private void testTreeMapDescendig(){
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		useMap(map);
		printMap(map);
	}
	public void testMaps(){
		testHashMap();
		testLinkedHashMap();
		testTreeMapAscendig();
		testTreeMapDescendig();
	}

	public static void main(String[] args){
		CollectionsMap test = new CollectionsMap();
		test.testMaps();
	}
}
