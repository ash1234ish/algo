package practice.algo.dynamicprogramming;

import java.util.Arrays;

public class LongestContinuosIncreasingSubsequence {
	
	public static void main(String[] args) {
		
		int [] nums = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLCIS(nums));
	}

	public static int lengthOfLCIS(int[] nums) {

		//base case	
		if(nums.length == 0)
			return 0;

		int[] maxLength = new int[nums.length];
		Arrays.fill(maxLength , 1);
		int maximumSoFar = 1;

		for (int i = 1; i < nums.length; i++) {
				if (nums[i-1] <= nums[i]) {
					maxLength[i] = maxLength[i-1]+1;
					maximumSoFar = Math.max(maximumSoFar, maxLength[i]);  
			}
		}
		return maximumSoFar;
	}
}
