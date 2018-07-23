package com.ajgaonkar.leetcode;

import java.util.Arrays;

public class LC452_Minimum_Number_Of_Arrows_To_Burst_Balloons {
	//What we are finding over here is number of intervals that do not overlap
	public int findMinArrowShots(int[][] points) {
		if((points == null) || (points.length == 0)){
			return 0;
		}
		Arrays.sort(points, (a,b) -> a[1] - b[1]);
		int arrowPos = points[0][1];
		int arrowsCnt = 1;
		for(int i=1; i< points.length; i++){
			if (arrowPos >= points[i][0]) {
				continue;
			}
			arrowsCnt++;
			arrowPos = points[i][1];
		}
		return arrowsCnt;
	}
}
