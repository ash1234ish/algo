package practice.algo.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

	}

	public static int lengthOfLIS(int[] nums) {

		//base case	
		if(nums.length == 0)
			return 0;

		int[] maxLength = new int[nums.length];
		Arrays.fill(maxLength , 1);
		int maximumSoFar = 1;

		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++){
				if (nums[i] > nums[j]) {
					maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
				}
			}
			maximumSoFar = Math.max(maximumSoFar, maxLength[i]);  
		}
		return maximumSoFar;

	}
}	
