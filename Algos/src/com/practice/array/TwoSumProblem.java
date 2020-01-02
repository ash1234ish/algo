package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static void main(String[] args) {
		int [] arr= {2,5,7,11};
		twoSum( arr,9);
	}
	//
	public static void twoSum(int [] arr ,int sum) {
		
		int left = 0;
		int right = arr.length -1;
		
		while(left < right) {
			
			if(arr[left]+ arr[right] > sum) {
				right --;
			}
			else if( arr[left]+ arr[right] < sum) {
				left ++;
			}
			else {
				System.out.println(arr[left] + " "+ arr[right]);
				break;
			}
		}
	}
	
	
	public static void twoSum2(int [] arr ,int sum) {
		
		Map<Integer,Integer> numberMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< arr.length ; i ++) {
			int complement= sum- arr[i];
			
			if(!numberMap.containsKey(arr[i]))
				numberMap.put(arr[i],arr[i]);
			
			if(numberMap.containsKey(complement))
				System.out.println(arr[i] + " " + complement);
			else {
				numberMap.put(complement,complement);
			}
		}
		
	}
}
