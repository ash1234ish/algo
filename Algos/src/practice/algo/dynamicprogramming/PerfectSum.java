package practice.algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PerfectSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = new int [] {2,4,6,10};
		
		int sum = 10 ;
		int sum2 = 50 ;
		int sum3 = 16 ;
		
		System.out.println(isSubSetSum(arr,sum,arr.length -1));
		System.out.println(isSubSetSum(arr,sum2,arr.length -1));
		System.out.println(isSubSetSum(arr,sum3,arr.length -1));
		
		System.out.println("*****************");
		
		System.out.println(countSubSetSum(arr,sum,arr.length -1));
		System.out.println(countSubSetSum(arr,sum2,arr.length -1));
		System.out.println(countSubSetSum(arr,sum3,arr.length -1));
		int subSet[] = new int [arr.length];
		
	//	arraySubSet(arr,0,new ArrayList<Integer>());
	}
	
	
	public static boolean isSubSetSum(int [] arr, int sum,int index) {
		
		if(sum == 0)
			return true;
		else if(index < 0)
			return false;
		else if(sum < 0)
			return false;
		else if(sum < arr[index])
			return isSubSetSum(arr, sum-arr[index], index-1);
		
		return isSubSetSum(arr,sum,index-1) || isSubSetSum(arr, sum-arr[index], index-1);
	}
	
	/**
	 * 
	 * @param arr
	 * @param sum
	 * @param index
	 * @return
	 */
	public static int countSubSetSum(int [] arr, int sum,int index) {
		
		if(sum == 0)
			return 1;
		else if(index < 0)
			return 0;
		else if(sum < 0)
			return 0;
		else if(sum < arr[index])
			return countSubSetSum(arr, sum-arr[index], index-1);
		
		return (countSubSetSum(arr,sum,index-1) + countSubSetSum(arr, sum-arr[index], index-1));
	}
	
	
//	public static void arraySubSet(int [] arr, int index,List<Integer> list) {
//		
//		if(index == arr.length) {
//			printArrya(list);
//		}	
//		
//		if(index >= arr.length) {
//			return;
//		}
//				
//		else {	
//			arraySubSet(arr,index+1,list.add(arr[index]));
//			arraySubSet(arr,index+1,list);
//		}		
//	}
	
	public static void printArrya(List<Integer> arr) {
		System.out.println();
		System.out.print("******[");
		for(int n : arr) {
			System.out.print(" " + n);
		}
		System.out.print(" ]");
	}

}
