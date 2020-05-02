package com.leetcode.contest;

import java.util.Arrays;

public class CheckIfaStringCanBreakAnotheString {

	public static void main(String[] args) {
		
		System.out.println(checkIfCanBreak("leetcodee","interview"));
	}
	
	public static boolean checkIfCanBreak(String s1, String s2) {
	    
		char [] str1 = s1.toCharArray();
		char [] str2 = s2.toCharArray();
		
		Arrays.parallelSort(str1);
		Arrays.parallelSort(str2);
		
		boolean result1 = true;
		boolean result2 = true;
		for(int i = 0; i < str1.length ; i++) {
			if(str1[i] > str2[i]) {
				result1 = false;
				break;
			}
		}
		
		if(result1)
			return result1;
		else {
			for(int i = 0; i < str2.length ; i++) {
				if(str2[i] > str1[i]) {
					result2 = false;
					break;
				}
			}
		
		if(result2)
			return result2;
		
		}
		return false;
    }

}
