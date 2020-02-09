package com.oracle.interview;

public class SumOfNumber {

	public int solution(int N) {
        // write your code in Java SE 8
		int originalSum = getSum(N);
        for(int i = N+9 ; i < Integer.MAX_VALUE ; i+=9) {
        	int newSum = getSum(i);
        	if(originalSum == newSum) {
        		return i;
        	}
        }
        return -1;
    }
    
    
    private int getSum(int n){
        String number = String.valueOf(n);
        int sum = 0;
        for(int i = 0 ; i< number.length() ; i++) {
        	sum = sum + Character.getNumericValue(number.charAt(i));
        }
        return sum ;
    }
}
