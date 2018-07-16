package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC381_Insert_Delete_Getrandom_O1_Duplicates_AllowedTest {

	@Test
	public void test(){
		LC381_Insert_Delete_Getrandom_O1_Duplicates_Allowed test = new LC381_Insert_Delete_Getrandom_O1_Duplicates_Allowed();
		assertEquals(true, test.insert(1));
		assertEquals(false, test.insert(1));
		assertEquals(false, test.insert(1));
		assertEquals(false, test.insert(1));

		assertEquals(true, test.insert(2));
		assertEquals(false, test.insert(2));

		assertEquals(true, test.insert(3));

		for(int i =0; i< 10; i++){
			System.out.println(test.getRandom());
		}


		assertEquals(true, test.remove(1));
		assertEquals(true, test.remove(2));
		assertEquals(true, test.remove(1));
		assertEquals(true, test.remove(1));
		assertEquals(false, test.remove(4));

		System.out.println("------ Part 2 ------");
		for(int i =0; i< 10; i++){
			System.out.println(test.getRandom());
		}

		assertEquals(true, test.remove(3));

		System.out.println("------ Part 3 ------");
		for(int i =0; i< 10; i++){
			System.out.println(test.getRandom());
		}

	}
}