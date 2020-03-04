package com.practice.arrays;

public class MaximumSumPossibleForKConsecutive {

	public static void main(String[] args) {
		int arr[] = {100, 200, 300, 400};
        int k = 2;
        
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++) {
        	int sum =0 ;
        	int counter = 0;
        	for(int j = i ; j< arr.length & counter <k;  j++ ) {
        		sum = sum + arr[j];
        		counter++;
        	}
        	maxSum = maxSum < sum ? sum : maxSum;
        }
        System.out.println(slidingwWindow(arr,k));
	}
	
	private static int slidingwWindow(int [] arr , int k) {
		int windowSum = 0;
		for(int i = 0 ; i< k ; i++) {
			windowSum = windowSum + arr[i];
		}
		int maxSum = windowSum;
		for( int i = k ; i < arr.length ;i++) {
			windowSum = windowSum + arr[i]- arr[i-k];
			maxSum = Math.max(windowSum, maxSum);
		}
		return maxSum;
	}
}
