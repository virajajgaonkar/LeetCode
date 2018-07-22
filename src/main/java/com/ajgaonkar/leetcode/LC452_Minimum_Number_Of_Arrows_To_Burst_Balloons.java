package com.ajgaonkar.leetcode;

import java.util.Arrays;

public class LC452_Minimum_Number_Of_Arrows_To_Burst_Balloons {
	public int findMinArrowShots(int[][] points) {
		int[] starts = new int[points.length];
		int[] ends = new int[points.length];
		for (int i = 0; i< points.length; i++){
			starts[i] = points[i][0];
			ends[i] = points[i][1];
		}
		int arrows = 0;
		Arrays.sort(starts);
		Arrays.sort(ends);
		int endIndex = 0;
		for (int i = 0; i < points.length; i++){
			if(starts[i] < ends[endIndex]){
				arrows++;
			} else {
				endIndex++;
			}
		}
		return arrows;
	}
}
