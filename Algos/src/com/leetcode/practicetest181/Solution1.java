package com.leetcode.practicetest181;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution1 {

	public static void main(String[] args) {

//		int [] nums = {1,2,3,4,0};
//		int [] index = {0,1,2,3,0};	
//		
//		int[] newArray = createTargetArray(nums,index);
//		
//		for(int no : newArray)
//			System.out.println(no);
		
		int arr []  = new int[10];
		
		Map <Integer,Integer> map = new HashMap();
		for(int i = 0 ; i < arr.length ; i++) {
			int n = arr[i];
			if(map.containsKey(n)) {
				int val = map.getOrDefault(n, 0);
				map.remove(n);
				map.put(n, val+1);
			}else {
				map.putIfAbsent(n, 1);
			}
		}
		
		Set<Entry<Integer,Integer>> set =  map.entrySet();
		
		int returnValue = Integer.MIN_VALUE;
		for(Entry en : set) {
			int key = (Integer) en.getKey();
			int value  = (Integer) en.getValue();
			if(key == value){
				returnValue =  key;
			}
		}
		
		if(returnValue == Integer.MIN_VALUE) {
			return 0;
		else
			return returnValue;
		
		
	}

	public static int[] createTargetArray(int[] nums, int[] index) {

		if(nums.length == 0 || index.length == 0)
			return new int[0];

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0 ; i < index.length ; i++) {
			int ind = index[i];
			int no = nums[index[i]];
			
			System.out.println( "INDex " + ind + "  " + no);
			if(list.size() >1) {
				Collections.rotate(list.subList(ind+1, list.size()), 1);
			}
			list.add(ind,no);
		}
		
		int[] newArray=new int[index.length];
		
		for(int i=0;i<list.size();i++){
			newArray[i]=(int)list.get(i);
		}
		
		return newArray;

	}



}
