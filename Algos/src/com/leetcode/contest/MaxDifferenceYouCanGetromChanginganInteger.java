package com.leetcode.contest;

public class MaxDifferenceYouCanGetromChanginganInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxDiff(777000));
	}


	public static int maxDiff(int num) {

		char [] arr = String.valueOf(num).toCharArray();
		char [] arr2 = String.valueOf(num).toCharArray();

		int no1 = Integer.MIN_VALUE ;
		int no2 = Integer.MIN_VALUE;


		char char1 = ' ';
		char char2 = ' ';
		int index = -1;
		for(int  i = 0; i< arr.length ; i++) {
			if(arr[i]< '9') {
				char1 = arr[i];
				break;
			}
		}
		if(char1 == ' ')
			char1 = '9';
		
		
		for(int i= 0; i < arr2.length ; i++) {
			if(arr2[i]!= char1 ) {
				char2= arr2[i];
				index = i;
				break;
			}
		}

		no1 = Integer.parseInt(new String(replaceChar(char1,'9',arr)));
		
		
		if(arr.length == 1)
			no2 = Integer.parseInt(new String(replaceChar(arr2[0],'1',arr2)));
		else {
			if(char1 == char2 || char2 == ' ') {
				no2 = Integer.parseInt(new String(replaceChar(arr2[0],'1',arr2)));
			}else {
				if(index != 0) {
					if(char2 == '0') {
						no2 = Integer.parseInt(new String(replaceChar(char2,'9',arr2)));
					}else {
						no2 = Integer.parseInt(new String(replaceChar(char2,'0',arr2)));
					}
					
				}else {
					no2 = Integer.parseInt(new String(replaceChar(char2,'1',arr2)));
				}
			}
		}

		return no1 - no2;

	}

	private static char [] replaceChar(char c1, char c2, char[] arr2) {
		
		for(int i = 0 ; i < arr2.length ; i++) {
			if(arr2[i] == c1)
				arr2[i]= c2;
		}
		return arr2;
	}

}
