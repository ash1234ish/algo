package com.practice.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(area(arr));
	}
	
	private static int area(int[] arr) {
		int i = 0 , j= arr.length-1;
		int maxArea = 0;
		int leftMax = 0;
		int rightMax = 0;
		while(i< j) {
			leftMax = Math.max(leftMax, arr[i]);
			rightMax = Math.max(rightMax, arr[j]);
			if(leftMax< rightMax) {
				maxArea += (leftMax - arr[i]);
				i++;		
			}else {
				maxArea += (rightMax- arr[j]);
				j--;
			}
		}
		return maxArea;
	}
}
