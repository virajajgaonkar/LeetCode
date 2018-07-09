package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC593_Valid_Square {
	public static class Point{
		int x;
		int y;
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public static long findDiff(Point p1, Point p2){
			return (long)Math.pow(Math.abs(p1.x - p2.x), 2) + (long)Math.pow(Math.abs(p1.y - p2.y), 2);
		}
	}

	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		Point point1 = new Point(p1[0], p1[1]);
		Point point2 = new Point(p2[0], p2[1]);
		Point point3 = new Point(p3[0], p3[1]);
		Point point4 = new Point(p4[0], p4[1]);

		long d1 = Point.findDiff(point1, point2);
		long d2 = Point.findDiff(point2, point3);
		long d3 = Point.findDiff(point3, point4);
		long d4 = Point.findDiff(point4, point1);
		long d5 = Point.findDiff(point1, point3);
		long d6 = Point.findDiff(point2, point4);

		List<Long> distances = new ArrayList<>();
		distances.add(d1);
		distances.add(d2);
		distances.add(d3);
		distances.add(d4);
		distances.add(d5);
		distances.add(d6);
		Collections.sort(distances);

		Set<Long> set = new HashSet<>(distances);
		if(set.size() != 2){
			return false;
		}

		if(distances.get(0).longValue() != distances.get(1).longValue()){
			return false;
		}

		if(distances.get(2).longValue() != distances.get(1).longValue()){
			return false;
		}

		if(distances.get(2).longValue() != distances.get(3).longValue()){
			return false;
		}
		if(distances.get(1).longValue() != distances.get(3).longValue()){
			return false;
		}

		long d7 = distances.get(0) + distances.get(1);
		return ((d7 == distances.get(4).longValue()) && (d7 == distances.get(5).longValue()));
	}
}
