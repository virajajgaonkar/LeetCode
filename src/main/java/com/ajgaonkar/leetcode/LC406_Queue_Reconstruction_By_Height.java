package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LC406_Queue_Reconstruction_By_Height {
	public int[][] reconstructQueue(int[][] people) {
		//pick up the tallest guy first
		//when insert the next tall guy, just need to insert him into kth position
		//repeat until all people are inserted into list
		Arrays.sort(people,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2){
				return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
			}
		});
		//List<int[]> res = new LinkedList<>();
		List<int[]> res = new ArrayList<>();
		for(int[] cur : people){
			res.add(cur[1],cur);
		}
		return res.toArray(new int[people.length][]);
	}
}
