package com.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveNumber {
	public static void main(String[] args) {
		int[] arr = {1};
		int pivot = findPivot(arr,0);
		System.out.println(missingPositive(arr,pivot));
	}
	
	private static int  findPivot(int arr[],int pivot) {
		
		int slow = -1;
		for(int i = 0 ;i < arr.length ;i++) {
			if(arr[i] >= 0) {
				slow++;
				int temp = arr[i];
				arr[i] = arr[slow];
				arr[slow]= temp;
			}
		}
		return slow+1;
	}
	private static int missingPositive(int arr[],int k) {
		if (k == 0)
			return 1;
		Set<Integer> set = new HashSet<>();
		for(int i = 1; i <= k; i++) {
			set.add(arr[i-1]);
		}
		for(int i = 1;i <=k ; i++) {
			if(!set.contains(i))
				return i;
		}
		return k+1;
	}

}
