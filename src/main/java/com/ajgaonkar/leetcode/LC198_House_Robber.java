package com.ajgaonkar.leetcode;

public class LC198_House_Robber {
	public int rob1(int[] nums) {
		int odd = 0;
		int even = 0;
		for (int i=0; i< nums.length; i++){
			if(i %2 == 0){
				even += nums[i];
			} else {
				odd += nums[i];
			}
		}
		return Math.max(odd, even);
	}

	public int rob2(int[] num) {
		int prevNo = 0;
		int prevYes = 0;
		for (int n : num) {
			int temp = prevNo;
			prevNo = Math.max(prevNo, prevYes);
			prevYes = n + temp;
			System.out.println("n = " + n + " prevNo = " + prevNo + " prevYes = " + prevYes);
		}
		return Math.max(prevNo, prevYes);
	}

	public int rob(int[] nums) {
		return rob2(nums);
	}
}
