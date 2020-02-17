//package com.codility.dealerSocket;
//
//import java.util.Arrays;
//
//import com.oracle.interview.Solution;
//
//public class Question2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		solution(new int[] {1,2,2}, new int[]{6});
//
//	}
//
//	public static int solution(int[] A, int[] B) {
////
////		int sumA = Arrays.stream(A).sum();
////		int sumB= Arrays.stream(B).sum();
////
////		Arrays.sort(A);
////		Arrays.sort(A);
////
////		int diff = sumA - sumB;
////
////
////
////
////		return 0;
////
////	}
//
//
//	public  static int solution(int[] a, int[] b) {
//		Arrays.sort(a);
//		Arrays.sort(b);
//		int count=0;
//
//		int sumA =Arrays.stream(a).sum();
//		int sumB =Arrays.stream(b).sum();
//
//
//
//		if (sumB > sumA) {
//
//			return getCount(a,b,sumA,sumB);
//		}else {
//			return getCount(b,a,sumB,sumA);
//
//		}
//	}
//
//	public static int getCount(int[] a, int[] b, int sumA, int sumB) {
//		int count = 0;
//		int diff = sumB - sumA;
//		int i = 0;
//		while (i < a.length && diff > 0) {
//			if (a[i] == 6) {
//				break;
//			}
//			int tempDiff = 6 - a[i];
//			if (tempDiff <= diff) {
//				diff = diff - tempDiff;
//				i++;
//				count++;
//			} else {
//				diff = 0;
//				count++;
//			}
//		}
//		if (diff != 0) {
//			int j = 0;
//			while (j < b.length && diff > 0) {
//
//				int tempDiff = b[j] - 1;
//
//				if (tempDiff == 0) {
//					j++;
//					continue;
//				}
//
//				if (tempDiff >= diff) {
//					count++;
//					diff = 0;
//				} else {
//					diff = diff - tempDiff;
//					j++;
//					count++;
//				}
//
//			}
//		}
//
//		if (diff != 0) {
//			return -1;
//		}
//
//		return count;
//	}
//
//}
