package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
	public static void main(String[] args) {
		int arr [] = {2,2,3,7};
		combinationSum(arr,0,new ArrayList<Integer>(),7);
	}
	
	public static void combinationSum(int []arr,int index, List<Integer> list,int sum) {
		
	}
	
	private static List<Integer> getList(List<Integer> list,int [] arr,int index){
		list.add(arr[index]);
		return list;
	}
}
