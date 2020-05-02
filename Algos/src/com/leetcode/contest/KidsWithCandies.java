package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	
	public static void main(String[] args) {
		
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
        List<Boolean> list = new ArrayList<Boolean>();
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < candies.length ; i++) {
			if(max < candies[i]) {
				max= candies[i];
			}
		}

		for(int i = 0; i < candies.length ; i++) {
			if((candies[i] + extraCandies) >= max) {
				list.add(i,true);
			}
			else {
				list.add(i,false);
			}
		}
		return list;  


	}

}
