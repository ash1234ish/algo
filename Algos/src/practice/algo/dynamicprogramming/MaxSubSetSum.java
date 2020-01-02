package practice.algo.dynamicprogramming;

public class MaxSubSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 static int maxSubsetSum(int[] arr) {

		int MaxSumSoFar = 0;
		
		for(int i =0 ; i < arr.length ; i ++) {
			int sum = arr[i];
			for(int j = i+2; j<arr.length; j+=2){
				sum = sum+ arr[j];
			}
			MaxSumSoFar = Math.max(MaxSumSoFar, sum);
		}
		return MaxSumSoFar;
	 }
}
