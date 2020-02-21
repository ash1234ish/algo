package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int arr [] = {2,2,3,7};
		combinationSum(arr,new ArrayList<Integer>(),7,0);
		
	}
	
	public static void combinationSum(int [] originalArray,List<Integer> list, int sum, int index) {
		if(sum ==0) {
			System.out.println("Found one");
			list.stream().forEach(System.out::print);
			return;
		}
		 
		if(sum < 0 || index >=originalArray.length)
			return;
		
		List newList = getList(list,index,originalArray);
		combinationSum(originalArray, newList, sum-originalArray[index],index+1);
		newList.remove(newList.size()-1);
		combinationSum(originalArray,newList, sum,index+1);
	}	
	
	private static List<Integer> getList(List<Integer> list,int index,int [] originalArray){
			list.add(originalArray[index]);
		return list;
	}
}
