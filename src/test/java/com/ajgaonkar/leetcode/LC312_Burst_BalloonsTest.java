package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC312_Burst_BalloonsTest {
	LC312_Burst_Balloons test = new LC312_Burst_Balloons();

	@Test
	public void test(){
		assertEquals(167, test.maxCoins(new int[]{3,1,5,8}));
	}
	@Test
	public void test2(){
		int length = 5;
		for(int i=0; i < length; i++){
			for(int j = i; j < length; j++){
				System.out.println("i = " + i + " j = " + j);
			}
		}
	}

	@Test
	public void test3(){
		int length = 5;
		for(int len=1; len<=length; len++){
			for(int i =0; i <= length -len; i++){
				int j = i + len -1;
				for(int k =i; k <=j; k++){
					System.out.println("len = " + len + " i = " + i + " j = " + j + " k = " + k);
				}
			}
		}
	}
}