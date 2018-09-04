package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC0036_Valid_Sudoku {
	private enum Region{
		REGION_0(0, 0),
		REGION_1(0, 1),
		REGION_2(0, 2),
		REGION_3(1, 0),
		REGION_4(1, 1),
		REGION_5(1, 2),
		REGION_6(2, 0),
		REGION_7(2, 1),
		REGION_8(2, 2);

		private final int xRegion;
		private final int yRegion;

		Region(int xRegion, int yRegion) {
			this.xRegion = xRegion;
			this.yRegion = yRegion;
		}

		private static final Map<Integer, Map<Integer, Region>> MAPPING = new HashMap<>();
		static {
			for(Region r : Region.values()){
				if(! MAPPING.containsKey(r.xRegion)){
					MAPPING.put(r.xRegion, new HashMap<>());
				}
				MAPPING.get(r.xRegion).put(r.yRegion, r);
			}
		}

		public static Region fromCoordinates(int x, int y){
			int xRegion = (x/3);
			int yRegion = (y/3);
			return MAPPING.get(xRegion).get(yRegion);
		}
	}
	public boolean isValidSudoku(char[][] board) {
		List<Set<Integer>> rows = new ArrayList<>(board.length);
		List<Set<Integer>> columns = new ArrayList<>(board[0].length);
		Map<Region, Set<Integer>> regions = new HashMap<>();

		for(int i=0; i < board.length; i++){
			rows.add(new HashSet<>());
		}
		for(int j=0; j < board[0].length; j++){
			columns.add(new HashSet<>());
		}
		for (Region r : Region.values()){
			regions.put(r, new HashSet<>());
		}

		for(int i=0; i < board.length; i++){
			for(int j=0; j < board[0].length; j++){
				if(board[i][j] == '.'){
					continue;
				}

				int val = (board[i][j] - '0');
				if(val > 9){
					return false;
				}

				if(rows.get(i).contains(val)){
					return false;
				}
				rows.get(i).add(val);

				if(columns.get(j).contains(val)){
					return false;
				}
				columns.get(j).add(val);

				Region r = Region.fromCoordinates(i, j);

				if(regions.get(r).contains(val)){
					return false;
				}
				regions.get(r).add(val);
			}
		}
		return true;
	}
}
