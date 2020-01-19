package com.leetcode.contest;

public class Solution1 {
	
	public static void main(String[] args) {
		int n = 9;
		System.out.println(maximum69Number(n));
	}
	 public static int maximum69Number (int num) {
	     
		 int maxNum = num;		 
		 char [] arr = String.valueOf(num).toCharArray();
		 
		 boolean changeCounter = true;;
		 for(int i = 0; i < arr.length ; i++) {
			 if(!changeCounter) {
				 break;
			 }
			 if(arr[i] == '6') {
				 arr[i] = '9';
				 System.out.println(String.valueOf(arr));
				 int number = Integer.parseInt(String.valueOf(arr));
				 if(number > maxNum) {
					 maxNum = number;
				 }
				 changeCounter =false;
			 }
		 }
		 return maxNum;
	    }
}
