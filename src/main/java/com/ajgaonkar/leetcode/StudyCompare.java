package com.ajgaonkar.leetcode;

public class StudyCompare {

	public void testIntegerCompare(){
		System.out.println("Integer.compare(5, 10) = " + Integer.compare(5, 10));
		System.out.println("Integer.compare(10, 10) = " + Integer.compare(10, 10));
		System.out.println("Integer.compare(20, 10) = " + Integer.compare(20, 10));
	}

	public static void main(String[] args){
		StudyCompare test = new StudyCompare();
		test.testIntegerCompare();
	}
}
