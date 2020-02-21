package com.practice.arrays;

import java.util.Arrays;

public class SearchForRange {
	
	public static void main(String[] args) {
		
		int [] arr= new int [] {5,7,7,8,8,10};
		Arrays.stream(searchRange(arr,5)).forEach(System.out::println);
	}
	
	public static int[] searchRange(int []arr, int target) {
		
		if(arr == null || arr.length == 0)
			return new int [] {-1,-1};
		
		int low =0 ,high = arr.length -1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(arr[mid] == target) {
				int i = mid , j = mid;
				while(i >= 0 && arr[i]==target ) {i--;}
				while(j <= arr.length -1 && arr[j]== target){j++;}
				return new int[] {i+1,j-1};
			}
			if(target < arr[mid]) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return new int [] {-1,-1};
	}

}
