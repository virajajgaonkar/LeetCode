package com.ajgaonkar.leetcode;

public class LC004_MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int mid = (len1 + len2 +1) /2;

		if(nums1[len1 -1] < nums2[0]){
			if(((len1 + len2) %2) == 0){
				return  ((double)(nums2[mid -len1] + nums2[mid -len1 -1])/(double)2);

			} else {
				return nums2[mid -len1 -1];
			}

		} else if(nums2[len2 -1] < nums1[0]){
			if(((len1 + len2) %2) == 0){
				return  ((double)(nums1[mid -len2] + nums1[mid -len2 -1])/(double)2);

			} else {
				return nums1[mid -len2 -1];
			}
		}

		int iMin = 0;
		int iMAX = len1 -1;
		int i = 0;
		int j = 0;
		while(iMin <= iMAX){
			i = (iMin + iMAX)/2;
			j = ((len1 + len2) /2) -i -1;
			boolean c1 = (i <= 1) ? true : nums1[i-1] < nums2[j];
			boolean c2 = (j <= 1) ? true: nums2[j-1] < nums1[i];
			if(c1 && c2){
				break;
			}
			if(!c1){
				iMAX = i;
			} else {
				iMin = i;
			}
		}
		if(((len1 + len2) %2) == 0){
			return ((double) (nums1[i] + nums2[j])/(double)2);
		} else {
			return Math.max(nums1[i], nums2[j]);
		}
	}
}
