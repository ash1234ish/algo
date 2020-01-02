package practice.algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsetsOfArray {
	public static void main(String[] args) {
		 
		int[] nums= {1, 2, 3};
		List<List<Integer>> subsets = subsets(nums);
// 
//		for (List<Integer> subset: subsets) {
//			System.out.println(subset);
//		}
	}
 
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
	}
	
	public static void  subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
		
		list.add(new ArrayList<>(resultList));
		
		//System.out.println(list);
		for(int i = start; i < nums.length; i++){
           // add element
			resultList.add(nums[i]);
           // Explore
			subsetsHelper(list, resultList, nums, i + 1);
           // remove
			
			System.out.println("before");
			System.out.println(resultList);
			resultList.remove(resultList.size() - 1);
			System.out.println("after");
			System.out.println(resultList);
		}
	}
}
