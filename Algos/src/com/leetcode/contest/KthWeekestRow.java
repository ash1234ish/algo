package com.leetcode.contest;

import java.util.Arrays;

public class KthWeekestRow {

	public static void main(String[] args) {
		
		int [][] arr = {{1,1,0,0,0},
		                {1,1,1,1,0},
		                {1,0,0,0,0},
		                {1,1,0,0,0},
		                {1,1,1,1,1}};
		
		printArry(kWeakestRows(arr,3));

	}
	
	
	 public static int[] kWeakestRows(int[][] mat, int k) {
		 int [] lengthArray = new int[k];
		 Arrays.fill(lengthArray, Integer.MAX_VALUE);
		 for(int i =0; i < mat.length; i++) {
			 int sum = 0;
			 for(int j =0 ; j < mat[i].length;j++) {
				 sum = sum + mat[i][j];
			 }
			 lengthArray = fillArray(lengthArray,sum,i);
		 }
		return   lengthArray;
	  }

	 public static int[] fillArray(int []arr, int sum,int index) {
		 for(int i =0 ; i < arr.length; i++){
			 if(sum < arr[i] && index > arr.length) {
					 arr[i]= index;
					 return arr;
			 }else if(i == index) {
				 arr[i]= index;
				 return arr;
			 }
		 }
		 return arr;
	 }
	 
	public static void printArry(int [] arr) {
		for(int i =0 ;i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
