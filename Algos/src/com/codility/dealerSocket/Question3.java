package com.codility.dealerSocket;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		minSwaps(null);
	}

	public int solution(String s, int[] C) {

		if(s == null || s.length() <2)
			return 0;
		int cost = 0;
		for(int i =1; i < s.length() ; i++) {
			if(s.charAt(i-1) == s.charAt(i)) {
				cost = cost+  (C[i-1] > C[i]?C[i] : C[i-1]);
			}
		}
		return cost;
	}


	static int minSwaps(String s) { 

		s ="WWRWWWRWR";
		char [] arr = s.toCharArray();
		int N = s.length();
	    boolean[] visited = new boolean[N]; 
	  
	    int minimumSwaps = 0; 
	    Arrays.fill(visited,false); 
	     
	  
	    for (int i = 0; i < 2 * N; i++) { 
	        if (visited[arr[i]] == false) { 
	            visited[arr[i]] = true; 
	  
	            int count = 0; 
	  
	            for (int j = i + 1; j < 2 * N; j++) { 
	  
	                if (visited[arr[j]] == false) 
	                    count++; 
	  
	                else if (arr[i] == arr[j]) 
	                    minimumSwaps += count; 
	            } 
	        } 
	    } 
	    return minimumSwaps; 
	}

}
