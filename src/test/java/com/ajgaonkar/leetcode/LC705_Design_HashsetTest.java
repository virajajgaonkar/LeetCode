package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC705_Design_HashsetTest {
	LC705_Design_Hashset hashSet = new LC705_Design_Hashset();
	//LC705_Design_Hashset_2 hashSet = new LC705_Design_Hashset_2();

	@Test
	public void test(){
		hashSet.add(1);
		hashSet.add(2);
		assertTrue(hashSet.contains(1));
		assertFalse(hashSet.contains(3));
		hashSet.add(2);
		assertTrue(hashSet.contains(2));
		hashSet.remove(2);
		assertFalse(hashSet.contains(2));


		hashSet.add(0);
		hashSet.add(1000000);
		assertTrue(hashSet.contains(0));
		assertTrue(hashSet.contains(1000000));

		hashSet.remove(0);
		hashSet.remove(1000000);

		assertFalse(hashSet.contains(0));
		assertFalse(hashSet.contains(1000000));
	}
}