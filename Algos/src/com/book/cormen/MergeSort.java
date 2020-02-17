package com.book.cormen;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] arr = new int[] {5,2,4,6,1,3};
		
		

	}
	
	public static void divide(int[] arr,int start, int end) {
		
		if(end > start) {
			
			int mid = (start+end)/2;
			
			divide(arr , start,mid);
			divide(arr,mid+1,end);
			
			merge(arr,start,mid,end);
			
		}
		
	}
	
	public static void merge(int[] arr,int start, int mid, int end) {
		
	}

}
