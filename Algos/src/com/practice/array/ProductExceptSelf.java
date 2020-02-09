package com.practice.array;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6};
		int resultArr[] = new int [6];
		
		
		int leftArray[] = new int[arr.length];
		int rightArray[] = new int [arr.length];
		

		leftArray[0] = 1;
		rightArray[arr.length -1] = 1;
		
		for(int i = 1 ; i < arr.length; i++) {
			leftArray[i] = leftArray[i-1]*arr[i-1];
		}
		
		for(int i = arr.length-2 ; i >= 0; i--) {
			rightArray[i] = rightArray[i+1]*arr[i+1];
		}
		
		
		for(int  i =0 ; i < arr.length ; i++) {
			resultArr[i] = leftArray[i] * rightArray[i];
		}
		
		
		
	}

}
