package com.ajgaonkar.leetcode;

import java.util.Stack;

public class LC224_Basic_Calculator {
	public static class Operation{
		private final int a;
		private final char o;
		public int b;
		public Operation(int a, char o) {
			this.a = a;
			this.o = o;
		}

		public int doOp() {
			if(o == '+'){
				return a + b;
			} else {
				return a -b;
			}
		}
	}
	public int calculate(String s) {
		String a = s.replace(" ", "");
		int result = 0;
		char[] c = a.toCharArray();
		Stack<Object> stack = new Stack<Object>();
		for(char n : c){
			if((n == '(')){
				stack.push(n);
				continue;
			} else if((n == '+') ||(n == '-')){

			}


		}
		return -1;

	}
}
