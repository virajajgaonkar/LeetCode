package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ZStudyMatrixTest {
	ZStudyMatrix test = new ZStudyMatrix();

	@Test
	public void test(){
		Character[][] arr = new Character[][]{
				{'a' , 'b' , 'c' , 'd' , 'e'},
				{'f' , 'g' , 'h' , 'j' , 'k'},
				{'l' , 'm' , 'n' , 'o' , 'p'},
				{'q' , 'r' , 's' , 't' , 'u'},
				{'v' , 'w' , 'x' , 'y' , 'z'}
		};
		List<List<Character>> res = test.travelDiagonal(arr);


	}

}