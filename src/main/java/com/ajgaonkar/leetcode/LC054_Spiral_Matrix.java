package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC054_Spiral_Matrix {
	public static enum Direction{
		DIRECTION_1(true, true),
		DIRECTION_2(false, true),
		DIRECTION_3(true, false),
		DIRECTION_4(false, false);
		private final boolean columns;
		private final boolean increment;

		Direction(boolean columns, boolean increment) {
			this.columns = columns;
			this.increment = increment;
		}

		public static Direction nextDirection(Direction currentDirection){
			if(currentDirection == DIRECTION_1){
				return DIRECTION_2;
			} else if(currentDirection == DIRECTION_2){
				return DIRECTION_3;
			} else if(currentDirection == DIRECTION_3){
				return DIRECTION_4;
			} else if(currentDirection == DIRECTION_4){
				return DIRECTION_1;
			}
			return DIRECTION_1;
		}

		public static int getNewI(Direction currentDirection, int currentI){
			if(currentDirection.columns){
				return currentI;
			} else {
				if(currentDirection.increment){
					return currentI +1;
				}  else {
					return currentI -1;
				}
			}
		}

		public static int getNewJ(Direction currentDirection, int currentJ){
			if(currentDirection.columns){
				if(currentDirection.increment){
					return currentJ +1;
				}  else {
					return currentJ -1;
				}
			} else {
				return currentJ;
			}
		}

	}


	private void travel(int[][] matrix, Direction direction, int i, int j, List<Integer> results, boolean[][] visited){
		results.add(matrix[i][j]);
		visited[i][j] = true;

		if(results.size() == (matrix.length * matrix[0].length)){
			return;
		}

		Direction newDirection = direction;
		int newI = Direction.getNewI(direction, i);
		int newJ = Direction.getNewJ(direction, j);
		if((newI == matrix.length) || (newJ == matrix[0].length) || (newI <0) || (newJ < 0) || (visited[newI][newJ] == true)){
			//Change Direction
			newDirection = Direction.nextDirection(direction);
		}

		newI = Direction.getNewI(newDirection, i);
		newJ = Direction.getNewJ(newDirection, j);
		travel(matrix, newDirection, newI, newJ, results, visited);
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		if((matrix == null) || (matrix.length == 0) || (matrix[0] == null)){
			return Collections.emptyList();
		}
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		List<Integer> results = new ArrayList<Integer>();
		travel(matrix, Direction.DIRECTION_1, 0, 0, results, visited);
		return results;
	}
}
