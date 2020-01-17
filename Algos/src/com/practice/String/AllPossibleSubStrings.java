package com.practice.String;

public class AllPossibleSubStrings {

	public static void main(String[] args) {
		printSubStrings("pwwkew");

	}
	
	public static void printSubStrings(String str) {
		for(int i = 0; i < str.length()-1 ; i++) {
			String c = str.substring(i,i+1);
			for(int j = i+1 ; j < str.length() ; j++) {
				System.out.println(c+str.substring(j,str.length()));
			}
			System.out.println(c);
		}
	}
}
