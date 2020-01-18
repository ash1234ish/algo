package com.practice.array;

public class SwapAnArrayelements {
	
	public static void main(String[] args) {
		int arr[] = new int [] {1,2,3,4,5,6,7};
		swap(arr,arr.length , 2);
		printArray(arr);
	}
	// O(d*n
	private static void swap(int arr[],int n, int d) {
		for(int j = 0 ; j <d ; j++) {
			int temp = arr[0];
			for(int i = 0 ; i < arr.length-1 ; i++) {
				arr[i]= arr[i+1];
			}
			arr[arr.length -1] = temp;
		}
	}
	private static void printArray(int arr[]) {
		for(int n : arr) {
			System.out.print(n);
		}
	}
}
