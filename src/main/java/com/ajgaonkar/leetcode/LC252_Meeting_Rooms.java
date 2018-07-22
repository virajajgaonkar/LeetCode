package com.ajgaonkar.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LC252_Meeting_Rooms {
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

	public boolean canAttendMeetings(Interval[] intervals) {
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

		Integer lastEnd = null;
		for(Interval current : intervals){
			if(lastEnd == null){
				lastEnd = current.end;
				continue;
			}
			if(current.start < lastEnd) {
				return false;
			}

			lastEnd = current.end;
		}
		return true;
	}
}
