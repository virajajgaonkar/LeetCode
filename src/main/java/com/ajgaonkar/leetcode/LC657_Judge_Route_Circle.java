package com.ajgaonkar.leetcode;

public class LC657_Judge_Route_Circle {
	public boolean judgeCircle(String moves) {
		if ((moves == null) || (moves.length() == 0)) {
			return true;
		}
		int currentX = 0;
		int currentY = 0;
		for(int i=0; i < moves.length(); i++){
			if('U' == moves.charAt(i)){
				currentY++;
			} else if('D' == moves.charAt(i)){
				currentY--;
			} else if('L' == moves.charAt(i)){
				currentX--;
			} else if('R' == moves.charAt(i)){
				currentX++;
			} else {
				throw new RuntimeException("Invalid Move");
			}
		}
		return ((currentX == 0) && (currentY == 0));
	}
}
