package com.ajgaonkar.leetcode;

//ToDo: Redo
public class LC134_Gas_Station {
	private int populateDiff(int[] gas, int[] cost, int[] diff){
		int totalDiff = 0;
		for (int i=0; i< gas.length; ++i){
			int curr = gas[i] - cost[i];
			diff[i] = curr;
			totalDiff += curr;
		}
		return totalDiff;
	}

	private boolean canCompleteCircuit(int[] diff, int start){
		if(diff[start] < 0){
			return false;
		}
		int len = diff.length;
		int continuousSum = 0;
		for(int i = 0; i< len; ++i){
			int index = (i + start) %len;
			continuousSum += diff[index];
			if(continuousSum <0 ){
				return false;
			}
		}
		return true;
	}
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int[] diff = new int[gas.length];
		int totalDiff = populateDiff(gas, cost, diff);
		if(totalDiff <0){
			return -1;
		}
		for(int i =0; i< diff.length; ++i){
			if(canCompleteCircuit(diff, i)){
				return i;
			}
		}
		return -1;
	}
}
