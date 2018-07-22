package com.ajgaonkar.leetcode;

public class LC374_Guess_Number_Higher_Or_Lower {
	private final int number;

	public LC374_Guess_Number_Higher_Or_Lower(int number) {
		this.number = number;
	}

	private int guess(int x){
		return number -x;
	}
	public int guessNumber(int n) {
		int start = 1;
		int end = n;
		while (start <= end){
			int mid = start + ((end - start) /2);
			int guess = guess(mid);
			if(guess == 0){
				return mid;
			} else if (guess < 0){
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
}
