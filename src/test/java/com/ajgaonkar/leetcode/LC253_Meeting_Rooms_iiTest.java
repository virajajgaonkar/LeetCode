package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC253_Meeting_Rooms_iiTest {
	LC253_Meeting_Rooms_ii test = new LC253_Meeting_Rooms_ii();

	@Test
	public void test(){
		assertEquals(2, test.minMeetingRooms(new LC253_Meeting_Rooms_ii.Interval[]{
				new LC253_Meeting_Rooms_ii.Interval(0,30),
				new LC253_Meeting_Rooms_ii.Interval(5,10),
				new LC253_Meeting_Rooms_ii.Interval(15,20)}));

		assertEquals(1, test.minMeetingRooms(new LC253_Meeting_Rooms_ii.Interval[]{
				new LC253_Meeting_Rooms_ii.Interval(7,10),
				new LC253_Meeting_Rooms_ii.Interval(2,4)}));

		assertEquals(3, test.minMeetingRooms(new LC253_Meeting_Rooms_ii.Interval[]{
				new LC253_Meeting_Rooms_ii.Interval(0,5),
				new LC253_Meeting_Rooms_ii.Interval(3,4),
				new LC253_Meeting_Rooms_ii.Interval(4,6),
				new LC253_Meeting_Rooms_ii.Interval(0,8),
				new LC253_Meeting_Rooms_ii.Interval(7,8),
				new LC253_Meeting_Rooms_ii.Interval(6,9)
		}));

		assertEquals(3, test.minMeetingRooms(new LC253_Meeting_Rooms_ii.Interval[]{
				new LC253_Meeting_Rooms_ii.Interval(0,4),
				new LC253_Meeting_Rooms_ii.Interval(4,8),
				new LC253_Meeting_Rooms_ii.Interval(0,6),
				new LC253_Meeting_Rooms_ii.Interval(5,9)
		}));
	}


}