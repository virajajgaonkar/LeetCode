package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ToDo: Redo
public class LC347_Top_K_Frequent_Elements {
	private static final class NumCount{
		private final Integer num;
		private final Integer count;

		private NumCount(Integer num, Integer count) {
			this.num = num;
			this.count = count;
		}

		public Integer getNum() {
			return num;
		}

		public Integer getCount() {
			return count;
		}
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> counts = new HashMap<>();
		for(int i=0; i< nums.length; ++i){
			if(!counts.containsKey(nums[i])){
				counts.put(nums[i], 0);
			}
			Integer count = counts.get(nums[i]);
			counts.put(nums[i], count +1);
		}
		ArrayList<NumCount> countsList = new ArrayList<>();
		for (Integer num : counts.keySet()){
			Integer count = counts.get(num);
			countsList.add(new NumCount(num, count));
		}
		Collections.sort(countsList, new Comparator<NumCount>() {
			@Override
			public int compare(NumCount o1, NumCount o2) {
				if(o1.getCount() < o2.getCount()){
					return 1;
				} else if (o1.getCount() > o2.getCount()){
					return -1;
				} else {
					return 0;
				}
			}
		});
		List<Integer> highestFreq = new ArrayList<>();
		for(int i=0; i< countsList.size(); ++i){
			if(highestFreq.size() == k){
				break;
			}
			highestFreq.add(countsList.get(i).getNum());
		}
		return highestFreq;
	}
}
