package com.oracle.interview;

import java.util.ArrayList;

public class FairNumber {
	public int solution(int[] A, int[] B) {

		A = new int []{4, -1, 0, 3} ;
		B = new int []{-2, 6, 0, 4} ;
		
		int len = A.length;
		int dp1left[] = new int[len];
		int dp1right[] = new int[len];

		int dp2left[] = new int[len];
		int dp2right[] = new int[len];

		dp1left[0] = A[0];
		dp1right[len-1] = A[len-1];

		dp2left[0] = B[0];
		dp2right[len-1] = B[len-1];

		for(int i = 1; i <len ; i++) {
			dp1left[i] = dp1left[i-1] + A[i];
			dp2left[i] = dp2left[i-1] + B[i];
		}

		for(int i = len-2; i >=0 ; i--) {
			dp1right[i] = dp1right[i+1] + A[i];
			dp2right[i] = dp2right[i+1] + B[i];
		}

		ArrayList<Integer> list = new ArrayList();

		for(int i = 1; i < len; i++) {
			if(dp1left[i-1] == dp1right[i]) {
				list.add(i-1);
			}
		}

		int count = 0;

		for(int i : list) {
			if(dp2left[i] == dp2right[i+1]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		new FairNumber().solution(null,null);
	}
}
