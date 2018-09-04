package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

//ToDo: Redo
public class LC089_Gray_Code {
	public List<Integer> grayCode(int n) {
		List<Integer> rs = new ArrayList<Integer>();
		rs.add(0);
		for (int i = 0; i < n; i++) {
			int size = rs.size();
			System.out.println(size);
			for (int k = size - 1; k >= 0; k--) {
				int mask = (1 << i);
//				System.out.println("i = " + i + " k = " + k + " mask = " + mask);
				int newNumber = (rs.get(k) | 1 << i);
//				System.out.println("newNumber = " + newNumber);

				System.out.println("i = " + i + " k = " + k + " mask = " + mask + " input = " + rs.get(k) + " newNumber = " + newNumber);
				rs.add(newNumber);
			}
		}
		return rs;
	}
}
