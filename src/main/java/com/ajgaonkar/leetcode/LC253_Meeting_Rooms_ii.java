package com.ajgaonkar.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LC253_Meeting_Rooms_ii {
	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
	public int minMeetingRooms(Interval[] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for (int i=0; i < intervals.length; i++){
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		int rooms = 0;
		int endIndex = 0;
		for(int i =0; i < intervals.length; i++){
			if(starts[i] < ends[endIndex]){
				rooms++;
			} else {
				endIndex++;
			}
		}
		return rooms;
	}
}
