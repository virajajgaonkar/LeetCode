package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC054_Spiral_MatrixTest {
	private final LC054_Spiral_Matrix test = new LC054_Spiral_Matrix();
	@Test
	public void test1(){
		int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
		List<Integer> actual = test.spiralOrder(matrix);
		List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
		assertArrayEquals(actual.toArray(), expected.toArray());
	}

	@Test
	public void test2(){
		int[][] matrix = new int[][]{{1,2,3, 4}, {5,6, 7,8}, {9, 10, 11, 12}};
		List<Integer> actual = test.spiralOrder(matrix);
		List<Integer> expected = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
		assertArrayEquals(actual.toArray(), expected.toArray());
	}

	@Test
	public void test3(){
		int[][] matrix = new int[][]{{1,2,3, 4}};
		List<Integer> actual = test.spiralOrder(matrix);
		List<Integer> expected = Arrays.asList(1,2,3,4);
		assertArrayEquals(actual.toArray(), expected.toArray());
	}

	@Test
	public void test4(){
		int[][] matrix = new int[][]{{1}, {2}, {3}};
		List<Integer> actual = test.spiralOrder(matrix);
		List<Integer> expected = Arrays.asList(1,2,3);
		assertArrayEquals(actual.toArray(), expected.toArray());
	}
}