package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class FindFourElementsSum {

	static class Pair{
		int first;
		public int getFirst() {
			return first;
		}
		public void setFirst(int first) {
			this.first = first;
		}
		public int getSecond() {
			return second;
		}
		public void setSecond(int second) {
			this.second = second;
		}
		int second;
		Pair (int first , int second){
			this.first = first;
			this.second = second;
		}
	}



	public static void main(String[] args) {
		int [] arr = {3, 4, 7, 1, 2, 9, 8};
		Map <Integer,Pair> map = new HashMap<Integer, Pair>();


		for(int i = 0 ; i < arr.length ; i++) {
			for(int j =i+1 ; j < arr.length ; j++) {
				
				int sum = arr[i] + arr[j];
				
				if(map.containsKey(sum)) {
					System.out.println("Combination = " + arr[i]+ " " + arr[j]+ " & " + ((Pair)map.get(sum)).getFirst()+ " " +  ((Pair)map.get(sum)).getSecond());
				}
				else {
					map.put(sum, new Pair(arr[i], arr[j]));
				}

			}
		}



	}



}
