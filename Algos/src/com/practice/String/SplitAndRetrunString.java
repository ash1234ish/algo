package com.practice.String;

public class SplitAndRetrunString {

	public static void main(String[] args) {

		String str = "I am Ashish";
		
		String [] arr = str.split(" ");
		
		for(int i = arr.length -1; i >=0 ; i --) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

}
