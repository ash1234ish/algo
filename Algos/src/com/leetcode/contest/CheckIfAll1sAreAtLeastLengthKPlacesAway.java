package com.leetcode.contest;

import java.util.HashSet;
import java.util.Iterator;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {

	public static void main(String[] args) {
		kLengthApart(new int[] {1,0,0,1,0,1},2);

	}


	public static boolean kLengthApart(int[] nums, int k) {
		
		int previousIndex = -1;
		
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] == 1 && previousIndex  == -1) {
				previousIndex = i;
				continue;
			}
			if(nums[i]==1 &&  previousIndex  != -1 ) {
				if( (previousIndex +k) < i) {
					previousIndex= i;
					continue;
				}else {
					return false;
				}
			}
		}
		return true;
	}

}
