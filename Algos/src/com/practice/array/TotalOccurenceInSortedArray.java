package com.practice.array;

public class TotalOccurenceInSortedArray {

	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,5,5,6,7,8};
		
		System.out.println(countOccurrences(arr,arr.length-1,5));

	}
	
	public static int binarySearch(int arr[],int start,int end,int x) {
		
		if(start > end)
			return -1;
		
			
		int mid = (start+end)/2;
		
		if(x == arr[mid])
			return mid;
		
		if(x > arr[mid])
			return binarySearch(arr,mid+1,end,x);
		
		return binarySearch(arr, start, mid-1, x);
		
	}
	
	
	static int countOccurrences(int arr[], int n, int x) 
	{ 
	    int ind = binarySearch(arr, 0, n - 1, x); 
	  
	    if (ind == -1) 
	        return 0; 
	  
	    // Count elements on left side. 
	    int count = 1; 
	    int left = ind - 1; 
	    while (left >= 0 && arr[left] == x) {
	    	count++;
	    	left--; 
	    }
	    // Count elements on right side. 
	    int right = ind + 1; 
	    while (right < n && arr[right] == x) {
	    	count++;
	    	right++;
	    }
	    return count; 
	} 

}
