package com.ajgaonkar.leetcode;

public class StudyMath {
	public void testRint(){
		System.out.println("round 1.1 = " + Math.round(1.1));
		System.out.println("rint 1.1 = " + Math.rint(1.1));

		System.out.println("round 1.4 = " + Math.round(1.4));
		System.out.println("rint 1.4 = " + Math.rint(1.4));

		System.out.println("round 1.5 = " + Math.round(1.5));
		System.out.println("rint 1.5 = " + Math.rint(1.5));

		System.out.println("round 1.51 = " + Math.round(1.51));
		System.out.println("rint 1.51 = " + Math.rint(1.51));

		System.out.println("round 1.6 = " + Math.round(1.6));
		System.out.println("rint 1.6 = " + Math.rint(1.6));

		System.out.println("round 1.9 = " + Math.round(1.9));
		System.out.println("rint 1.9 = " + Math.rint(1.9));


		System.out.println("round 2.1 = " + Math.round(2.1));
		System.out.println("rint 2.1 = " + Math.rint(2.1));

		System.out.println("round 2.4 = " + Math.round(2.4));
		System.out.println("rint 2.4 = " + Math.rint(2.4));

		System.out.println("round 2.5 = " + Math.round(2.5));
		System.out.println("rint 2.5 = " + Math.rint(2.5));

		System.out.println("round 2.51 = " + Math.round(2.51));
		System.out.println("rint 2.51 = " + Math.rint(2.51));

		System.out.println("round 2.6 = " + Math.round(2.6));
		System.out.println("rint 2.6 = " + Math.rint(2.6));

		System.out.println("round 2.9 = " + Math.round(2.9));
		System.out.println("rint 2.9 = " + Math.rint(2.9));
	}

	public void testPreAndPost(){
		int a = 100;
		if(++a == 100){
			System.out.println("a == 100 matched, a = " + a);
		} else {
			System.out.println("a == 100 NOT matched, a = " + a);
		}

		int b = 100;
		if(b++ == 100){
			System.out.println("b == 100 matched, b = " + b);
		} else {
			System.out.println("b == 100 NOT matched, b = " + b);
		}
	}

	public static void main(String[] args){
		StudyMath test = new StudyMath();
		test.testRint();
		test.testPreAndPost();
	}
}
