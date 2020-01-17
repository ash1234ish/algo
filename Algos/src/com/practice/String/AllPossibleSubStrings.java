package com.practice.String;

import java.util.HashSet;
import java.util.Set;

public class AllPossibleSubStrings {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s == null || s.isEmpty())
			return 0;
		else{
			int largestSofar = 1;
			for(int i = 0; i < s.length()-1 ; i++) {
				String c = s.substring(i,i+1);
				for(int j = 0 ; j < s.length() -i ; j++) {
					String temp = c+s.substring(i+1,s.length()-j);
					int uniqueLength = 0;
					if(uniqueStringlength(temp)) {
						uniqueLength = temp.length();
					}
					largestSofar = (largestSofar > uniqueLength) ? largestSofar : uniqueLength;
				}
				largestSofar = (largestSofar > c.length()) ? largestSofar : c.length();
			}
			return largestSofar;
		}    
	}

	public static boolean uniqueStringlength(String str) {
		Set<String> set = new HashSet<String>();
		for(int i = 0 ; i < str.length() ; i++) {
			String c = str.substring(i,i+1);
			if(set.contains(c)) {
				return false;
			}else {
				set.add(c);
			}
		}
		return true;
	}
}
