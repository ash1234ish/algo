package com.practice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {

		countElements(new int[]{1,2,3});

	}

	static int countElements(int[] arr) {

		Map<Integer, Integer> map = new HashMap();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
			
		}
		int count = 0;
		Set entrySet = map.keySet();
		
		for(Object  i : entrySet) {
			Integer key = (Integer) i;
			if(map.containsKey(key+1)) {
				count+= map.get(key);
			}
		}
		
		return count;

	}
}
