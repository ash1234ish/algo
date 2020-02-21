package com.practice.arrays;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		
		int arr [] = new int [] {14,15,16,17,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int number = 15;
		System.out.println(search(arr,number));
	}
	
	public static int search( int [] arr , int number) {
		int rotationIndex = 0;
		int size = arr.length ;
		while(rotationIndex < size -2) {
			if(arr[rotationIndex] > arr[rotationIndex+1]) {
				rotationIndex++;
				break;
			}
			rotationIndex++;
		}
		
		if(number < arr[0]) {
			return	binarySearch(arr,rotationIndex++,size-1,number);
		}else {
			return binarySearch(arr,0,rotationIndex,number);
		}
		
	}
	
	public static int binarySearch(int arr[], int startIndex , int endIndex, int number) {
		if(startIndex > endIndex) {
			return -1;
		}
		
		int mid = (startIndex + endIndex)/2;
		if(arr[mid] == number)
			return mid;
		
		if(number < arr[mid])
			return binarySearch(arr,startIndex,mid,number);
			
		return binarySearch(arr,mid+1,endIndex,number);
	}
}
