package com.practice.arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,1,2};
		int slow = 0;
		
		for(int i = 1; i < arr.length ; i++) {
			if(arr[slow] != arr[i]) {
				arr[++slow] = arr[i];
			}
		}
		
		System.out.println(slow);
	}
}
