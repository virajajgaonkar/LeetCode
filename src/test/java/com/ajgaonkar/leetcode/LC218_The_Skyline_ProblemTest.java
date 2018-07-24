package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC218_The_Skyline_ProblemTest {
	LC218_The_Skyline_Problem test = new LC218_The_Skyline_Problem();

	@Test
	public void test(){
		int [][] buildings = {{1,3,4},{3,4,4},{2,6,2},{8,11,4}, {7,9,3},{10,11,2}};
		List<int[]> actual = test.getSkyline(buildings);
		actual.forEach(cp -> System.out.println(cp[0] + " " + cp[1]));
		List<int[]> expected = Arrays.asList(new int[]{1,4},new int[]{4,2}, new int[]{6,0}, new int[]{7,3},
				new  int[]{8,4}, new  int[]{11,0});

		assertEquals(actual.size(), expected.size());
		for(int i=0; i < actual.size(); i++){
			assertEquals(actual.get(i)[0], expected.get(i)[0]);
			assertEquals(actual.get(i)[1], expected.get(i)[1]);
		}
	}

}