package practice.algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {

	public static void main(String[] args) {
		int [] arr = {2,3,4,5,6,10};
		powerSet(arr, 0, new ArrayList<Integer>(),9);
	}

	public static void powerSet(int arr[],int index, List<Integer> list , int sum) {

		if(index >= arr.length || sum < 0 )
			return;

		if(sum == 0) {
			printList(list);
			return;
		}
		if(list.size() > 0 ) {
			if(arr[index] == (list.get(list.size() -1) +1)) {
				powerSet(arr, index+1, getList(list,arr,index),sum-arr[index]);
			}
			powerSet(arr, index+1, list,sum);
		}else{
			powerSet(arr, index+1, getList(list,arr,index),sum-arr[index]);
			powerSet(arr, index+1, list,sum);
		}
	}

	public static void printList(List<Integer> list) {
		if(list.size() <=1)
			return;
		System.out.print("{");
		for(int n : list) {
			System.out.print( " " + n);
		}
		System.out.print("}");
		System.out.println("");
	}

	public static List<Integer> getList(List<Integer> list, int [] arr,int index){
		List<Integer> lst = new ArrayList<Integer>();
		lst.addAll(list);
		lst.add(arr[index]);
		return lst;
	}
}
