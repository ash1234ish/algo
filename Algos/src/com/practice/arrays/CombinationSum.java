package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int arr [] = {2,2,3,7};
		combinationSum(arr,0,new ArrayList<Integer>(),7);
		
	}
	
	public static void combinationSum(int arr[],int index, List<Integer> list , int sum) {
		if(index >= arr.length || sum < 0 )
			return;
		
		if(sum == 0) {
			list.stream().forEach(System.out::print);
			return;
		}
		if(list.size() > 0 ) {
			if(arr[index] == (list.get(list.size() -1) +1)) {
				combinationSum(arr, index+1, getList(list,arr,index),sum-arr[index]);
			}
			combinationSum(arr, index+1, list,sum);
		}else{
			combinationSum(arr, index+1, getList(list,arr,index),sum-arr[index]);
			combinationSum(arr, index+1, list,sum);
		}
	}	
	
	private static List<Integer> getList(List<Integer> list,int [] originalArray,int index){
		list.add(originalArray[index]);
		return list;
	}
	
	
}
