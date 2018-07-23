package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC435_Non_Overlapping_IntervalsTest {
	LC435_Non_Overlapping_Intervals test = new LC435_Non_Overlapping_Intervals();

	@Test
	public void test() {
		assertEquals(1, test.eraseOverlapIntervals(new LC435_Non_Overlapping_Intervals.Interval[]{
				new LC435_Non_Overlapping_Intervals.Interval(1, 2),
				new LC435_Non_Overlapping_Intervals.Interval(2, 3),
				new LC435_Non_Overlapping_Intervals.Interval(3, 4),
				new LC435_Non_Overlapping_Intervals.Interval(1, 3)
		}));

		assertEquals(2, test.eraseOverlapIntervals(new LC435_Non_Overlapping_Intervals.Interval[]{
				new LC435_Non_Overlapping_Intervals.Interval(1, 2),
				new LC435_Non_Overlapping_Intervals.Interval(1, 2),
				new LC435_Non_Overlapping_Intervals.Interval(1, 2)
		}));
		assertEquals(0, test.eraseOverlapIntervals(new LC435_Non_Overlapping_Intervals.Interval[]{
				new LC435_Non_Overlapping_Intervals.Interval(1,2),
				new LC435_Non_Overlapping_Intervals.Interval(2,3),
				new LC435_Non_Overlapping_Intervals.Interval(3,4),
				new LC435_Non_Overlapping_Intervals.Interval(4,5)
		}));
	}
}