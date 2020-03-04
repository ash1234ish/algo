package com.practice.array;

import java.util.Arrays;

public class JumpGame2 {

	public static void main(String[] args) {
		
		int [] arr = {2,3,1,1,4};
		System.out.println(minimumJumpNeeded(arr));
	}

	
	private static int minimumJumpNeeded(int [] arr) {
		int [] jumpArr = new int[arr.length];
		Arrays.fill(jumpArr, Integer.MAX_VALUE);
		
		jumpArr[0] =0;
		
		for(int i = 1; i < arr.length ; i++) {
			for(int j = 0; j < i ; j++) {
				if(j+arr[j] >= i) {
					jumpArr [i] = Math.min(jumpArr [i], jumpArr[j]+1);
				}
			}
		}
		return jumpArr[jumpArr.length-1];
	}
}
