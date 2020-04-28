package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZeros {
	
	public static void main(String[] args) {
		
		MoveZeros mv = new MoveZeros();
		
		int [] nums = {0,1,0,3,12};
		mv.moveZeroes(nums);
		
	}

	public void moveZeroes(int[] nums) {

		int right = nums.length-1;
        int i = nums.length-1;
        
        while(i >= 0){
            if(nums[i] == 0){
            	
            	int j = i;
            	while(i < right) {
            		int temp = nums[i+1];
            		nums[i+1] = nums[i];
            		nums[i] = temp;
            		i++;
            	}
            	right --;
            }
            i--;
        }       
        
        Arrays.stream(nums).forEach(System.out::println);

	}
	
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums, (a,b)->{
        	return b- a;
        });
        
        Integer sum = Arrays.stream(nums)
                          .mapToInt(Integer::intValue)
                          .sum();
        
        int half = sum/2;
        
        int currentSum = 0;
        
        List<Integer> returnList = new ArrayList();
        int inde = 0;
        while(currentSum < sum +1 && index < nums.length){
            currentSum += nums[i] ;
            i++;
            returnList.add(index,nums[i]);
        }
        
        return returnList;
        
        
    }
	
	
	
	
}
