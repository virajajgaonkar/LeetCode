package com.ajgaonkar.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC252_Meeting_RoomsTest {
	LC252_Meeting_Rooms test = new LC252_Meeting_Rooms();

	@Test
	public void test(){
		assertEquals(false, test.canAttendMeetings(new LC252_Meeting_Rooms.Interval[]{
				new LC252_Meeting_Rooms.Interval(0, 30),
				new LC252_Meeting_Rooms.Interval(5, 10),
				new LC252_Meeting_Rooms.Interval(15, 20)
				}));

		assertEquals(true, test.canAttendMeetings(new LC252_Meeting_Rooms.Interval[]{
				new LC252_Meeting_Rooms.Interval(7, 10),
				new LC252_Meeting_Rooms.Interval(2, 4)
		}));
	}
}