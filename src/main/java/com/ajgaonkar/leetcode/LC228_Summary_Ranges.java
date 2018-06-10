package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC228_Summary_Ranges {
	public static final class Range {
		public final Integer start;
		public Integer end;

		public Range(Integer start) {
			this.start = start;
			this.end = start;
		}

		@Override
		public String toString() {
			if(end == start){
				return String.valueOf(start);
			}
			return String.valueOf(start) + "->"  + String.valueOf(end);
		}
	}
	public List<String> summaryRanges(int[] nums) {
		if((nums == null) || (nums.length == 0)){
			return Collections.emptyList();
		}
		List<Range> ranges = new ArrayList<Range>();
		Range r = null;
		for(int i = 0; i< nums.length; i++){
			int cur = nums[i];
			if(r == null){
				r = new Range(cur);
			} else {
				if(r.end == cur-1){
					r.end = cur;
				} else {
					ranges.add(r);
					r = new Range(cur);
				}
			}
		}
		ranges.add(r);
		List<String> op = new ArrayList<String>();
		for(Range c: ranges){
			op.add(c.toString());
		}
		return op;
	}
}
