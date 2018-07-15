package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//ToDo: Redo
public class LC349_Intersection_Of_Two_Arrays {
	private Map<Integer, Integer> convertArrayToMap(int[] nums){
		Map<Integer, Integer> m = new HashMap<>();
		for(int i=0; i< nums.length; ++i){
			int cur = nums[i];
			if(!m.containsKey(cur)){
				m.put(cur, 0);
			}
			int val = m.get(cur) +1;
			m.put(cur, val);
		}
		return m;
	}

	private int[] findIntersection(Map<Integer, Integer> m1, Map<Integer, Integer> m2, boolean uniq){
		ArrayList<Integer> result = new ArrayList<>();
		for (int cur : m1.keySet()){
			if(!m2.containsKey(cur)){
				continue;
			}
			int val = Math.min(m1.get(cur), m2.get(cur));
			if(uniq){
				val =1;
			}
			for(int i =0; i< val; ++i){
				result.add(cur);
			}
		}
		int[] a = new int[result.size()];
		int index = 0;
		for(int cur: result){
			a[index] = cur;
			index++;
		}
		return a;
	}
	public int[] intersection(int[] nums1, int[] nums2) {
		if((nums1 == null) || (nums2== null) || (nums1.length == 0) || (nums2.length ==  0)){
			return new int[0];
		}
		Map<Integer, Integer> m1 = convertArrayToMap(nums1);
		Map<Integer, Integer> m2 = convertArrayToMap(nums2);

		if(m1.keySet().size() <= m2.keySet().size()){
			return findIntersection(m1, m2, true);
		} else {
			return findIntersection(m2, m1, true);
		}
	}
}
