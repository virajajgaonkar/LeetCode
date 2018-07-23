package com.ajgaonkar.leetcode;

import java.util.Arrays;

public class LC435_Non_Overlapping_Intervals {
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

	public int eraseOverlapIntervals(Interval[] intervals) {
		if((intervals == null) || (intervals.length == 0)){
			return 0;
		}
		Arrays.sort(intervals, (a,b) -> a.end - b.end);
		//Initialize nonOverlappingIntervals as 1
		int nonOverlappingIntervals = 1;
		int intervalEnd = intervals[0].end;
		for(int i=1; i < intervals.length; i++){
			//If new Interval is outside of current Interval - It is a non overlapping interval
			if(intervals[i].start >= intervalEnd){
				nonOverlappingIntervals++;
				intervalEnd = intervals[i].end;
			}
		}
		//Overlapping Intervals
		return intervals.length - nonOverlappingIntervals;
	}
}
