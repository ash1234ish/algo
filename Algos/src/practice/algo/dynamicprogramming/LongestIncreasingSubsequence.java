package practice.algo.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr [] = {1,4,6,89,10,23,12,102};
		
		System.out.println(lengthOfLIS(arr));
	}

//	public static int lengthOfLIS(int[] arr) {
//		if(arr.length == 0)
//			return 0;
//
//		int[] maxLength = new int[arr.length];
//		int [] subequence = new int[arr.length];
//		Arrays.fill(maxLength , 1);
//		Arrays.fill(subequence , 0);
//		int maximumSoFar = 1;
//
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 0; j < i; j++){
//				if (arr[i] > arr[j]) {
//					maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
//				}else {
//					maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
//				}
//			}
//			maximumSoFar = Math.max(maximumSoFar, maxLength[i]);  
//		}
//		return maximumSoFar;
//
//	}
	
	public static int lengthOfLIS(int[] arr) {
		
		if(arr.length ==0)
			return 0;
		
		Integer [] maxLength = new Integer[arr.length];
		Integer [] subSequence = new Integer[arr.length];
		Arrays.fill(maxLength, 1);
		
		for(int  i = 1; i < arr.length ; i++) {
			for( int j = 0; j < i ; j++) {
					if(arr[j] < arr[i]) {
						maxLength[i] = Math.max(maxLength[i],maxLength[j]+1 );
						subSequence[i] =j;
					}
			}
		}
		
		int max = Arrays.stream(maxLength).max((i, j) -> i.compareTo(j)).get();
		Arrays.stream(subSequence).forEach(System.out::print);
		return max;
	}

}	
