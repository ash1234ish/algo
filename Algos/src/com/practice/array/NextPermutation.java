package com.practice.array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		NextPermutation nxt = new NextPermutation();
		int [] arr = new int[] {1,3,2};
		int firstDecreasingIndex = getDecreasingIndex(arr);
		int largerIndex = findJustLargerElement(firstDecreasingIndex,arr);
		arr = swap(arr,firstDecreasingIndex,largerIndex);
		arr = reverse(arr,firstDecreasingIndex+1);
		Arrays.stream(arr).forEach(System.out::println);
		
	}

	public static int getDecreasingIndex(int [] arr) {
		for(int i = arr.length -2; i>=0 ; i--) {
			if(i-1 >=0 && arr[i-1] <= arr[i]) {
				return i;
			}else {
				return i;
				
			}
		}
		return -1;
	}
	
	private static int findJustLargerElement(int firstDecreasingIndex, int []arr) {
		int largerIndex = Integer.MAX_VALUE;
		int difference = Integer.MIN_VALUE;
		
		for(int i = firstDecreasingIndex+1; i< arr.length ; i++) {
			if(arr[firstDecreasingIndex] <= arr[i]) {
				if(difference <= (arr[i] -arr[firstDecreasingIndex])) {
					difference =   arr[i] -arr[firstDecreasingIndex];
					largerIndex =  i;
				}
			}
		}
		return (difference !=Integer.MIN_VALUE)? largerIndex : -1;
	}
	
    private static int [] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    
    private static int [] reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
       return nums;
    }
}
