package com.practice.String;

public class FindAPattern {

	public static void main(String[] args) {
		
		String txt = "AABAACAADAABAAABAA"; 
		String pat = "AABA"; 

		for(int i = 0 ; i < txt.length() - pat.length(); i++) {
			int j =0;
			while(j < pat.length()) {
				if(txt.charAt(i+j) != pat.charAt(j)) {
					break;
				}
				j++;	
			}

			if(j == pat.length()) {
				System.out.println("Pattern found at index " + i); 
			}
		}

	}
}