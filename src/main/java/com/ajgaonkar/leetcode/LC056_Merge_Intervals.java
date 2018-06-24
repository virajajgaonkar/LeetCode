package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class LC056_Merge_Intervals {
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
	public static class Sorter implements Comparator<Interval>{
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}
	}

	public List<Interval> merge(List<Interval> intervals) {
		Collections.sort(intervals, new Sorter());

		Stack<Interval> s = new Stack<Interval>();
		for (Interval c : intervals){
			if(s.empty()){
				s.push(c);
				continue;
			}
			Interval p = s.peek();
			if(p.end < c.start){
				s.push(c);
			} else if(p.end >= c.end){
				//do nothing
			} else {
				Interval n = new Interval(p.start, c.end);
				s.pop();
				s.push(n);
			}
		}

		List<Interval> result = new ArrayList<Interval>(s);
		Collections.sort(result, new Sorter());
		return result;
	}
}
