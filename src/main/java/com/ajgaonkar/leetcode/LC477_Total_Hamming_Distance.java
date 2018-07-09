package com.ajgaonkar.leetcode;

public class LC477_Total_Hamming_Distance {
	private int hammingDistance(int x, int y){
//		System.out.println("x = " + x + " y = " + y);
		int result =0;
		for(int i=0; i< 32; i++){
			if(((x >> i) & 1) != ((y >> i) & 1)){
				result++;
			}
		}
		return result;
	}
	public int totalHammingDistance2(int[] nums) {
		if((nums== null) && (nums.length < 2)){
			return 0;
		}
		int result = 0;
		for(int i =0; i < nums.length -1; i++){
			for(int j = i +1; j < nums.length; j++){
				result += hammingDistance(nums[i], nums[j]);
			}
		}
		return result;
	}

	public int totalHammingDistance(int[] nums) {
		int total = 0;
		int n = nums.length;
		for(int i =0; i < 32; i++){
			int bitCount = 0;
			for(int j=0; j<n; j++){
				if(((nums[j] >> i) & 1) == 1){
					bitCount++;
				}
			}
			total += bitCount * (n - bitCount);
		}
		return total;
	}


}
