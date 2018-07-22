package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC374_Guess_Number_Higher_Or_LowerTest {
	@Test
	public void test(){
		LC374_Guess_Number_Higher_Or_Lower test = new LC374_Guess_Number_Higher_Or_Lower(6);
		assertEquals(6 , test.guessNumber(10));
	}

	@Test
	public void test2(){
		LC374_Guess_Number_Higher_Or_Lower test = new LC374_Guess_Number_Higher_Or_Lower(1);
		assertEquals(1 , test.guessNumber(1));
	}

	@Test
	public void test3(){
		LC374_Guess_Number_Higher_Or_Lower test = new LC374_Guess_Number_Higher_Or_Lower(1);
		assertEquals(1 , test.guessNumber(2));

		LC374_Guess_Number_Higher_Or_Lower test2 = new LC374_Guess_Number_Higher_Or_Lower(2);
		assertEquals(2 , test2.guessNumber(2));
	}

	@Test
	public void test4(){
		LC374_Guess_Number_Higher_Or_Lower test = new LC374_Guess_Number_Higher_Or_Lower(1702766719);
		assertEquals(1702766719 , test.guessNumber(2126753390));
	}
}