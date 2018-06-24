package com.ajgaonkar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC056_Merge_IntervalsTest {
	LC056_Merge_Intervals test = new LC056_Merge_Intervals();
	@Test
	public void test(){
		List<LC056_Merge_Intervals.Interval> expected = Arrays.asList(new LC056_Merge_Intervals.Interval(1,6), new LC056_Merge_Intervals.Interval(8,10), new LC056_Merge_Intervals.Interval(15,18));
		List<LC056_Merge_Intervals.Interval> res = test.merge(Arrays.asList(new LC056_Merge_Intervals.Interval(1,3), new LC056_Merge_Intervals.Interval(2,6), new LC056_Merge_Intervals.Interval(8,10), new LC056_Merge_Intervals.Interval(15,18)));
		assertEquals(expected.size(), res.size());
		for(int i = 0; i < expected.size(); i++){
			assertEquals(expected.get(i).start, res.get(i).start);
			assertEquals(expected.get(i).end, res.get(i).end);
		}
	}

	@Test
	public void test2(){
		List<LC056_Merge_Intervals.Interval> expected = Arrays.asList(new LC056_Merge_Intervals.Interval(1,5));
		List<LC056_Merge_Intervals.Interval> res = test.merge(Arrays.asList(new LC056_Merge_Intervals.Interval(1,4), new LC056_Merge_Intervals.Interval(4,5)));
		assertEquals(expected.size(), res.size());
		for(int i = 0; i < expected.size(); i++){
			assertEquals(expected.get(i).start, res.get(i).start);
			assertEquals(expected.get(i).end, res.get(i).end);
		}
	}

}