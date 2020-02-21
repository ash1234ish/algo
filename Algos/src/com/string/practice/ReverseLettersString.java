package com.string.practice;

public class ReverseLettersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = strReverse("man bytes dog");
		
		String resultantString = "";
		
		int startIndex =0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == ' ') {
				resultantString = resultantString + strReverse(s.substring(startIndex,i+1));
				startIndex = i;
			}
		}
		resultantString = resultantString + strReverse(s.substring(startIndex,s.length()));
		System.out.println(resultantString);
	}
	
	public static String strReverse(String str) {
		String reve = "";
		for(int i = str.length() -1 ; i >= 0; i--) {
			reve = reve + str.charAt(i);
		}
		return reve;
	}
}
