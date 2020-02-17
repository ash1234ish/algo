package com.book.cormen;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] arr = new int[] {5,2,4,6,1,3};
		for(int i =1 ; i < arr.length ;i++) {
			int j = i-1;
			int key = arr[i];
			while(j >=0 && arr[j] < key) {
				arr[j+1] = arr[j];
				arr[j] = key;
				j = j-1;
			}
			
		}
		Arrays.stream(arr).forEach(System.out::print);

	}

}
